// 미세먼지(한국환경공단_에어코리아_대기오염정보)관련 API를 활용하여 다음 질문에 답하시오.
require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.DATAGO_KEY_EN;
const APIKEY2 = process.env.DATAGO_KEY_DE;

function filterNetworkError(data) {
  return data.filter((el) => {
    if (el.pm25Flag === '통신장애') return false;
    return true;
  })
}

async function fetchDustInfo() {
  try {
    // 1. `시도별 실시간 측정정보 조회`에서 확인 가능한 시도 이름을 전부 작성하시오.
    console.log("전국, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종");

    // 2. `시도별 실시간 측정정보 조회`의 `서울`의 데이터에 대해, 초 미세먼지 농도가 가장 낮은 `stationName`을 찾으시오.
    const URL = `https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey=${APIKEY}&returnType=json&numOfRows=100&pageNo=1&sidoName=서울&ver=1.0`
    const response = await fetch(URL);
    const data = await response.json();
    const stations = data.response.body.items;

    const filteredStations = filterNetworkError(stations);

    const lowestStaion = filteredStations.reduce((acc, cur) => {
      if (parseInt(acc.pm25Value) > parseInt(cur.pm25Value)) return cur;
      else return acc;
    });

    console.log(`${lowestStaion.stationName}: ${lowestStaion.pm25Value}`);

    // let minPm25Value = Infinity;
    // let minPm25StationName = null;
    // for (const station of filteredStations) {
    //   const pm25Value = parseInt(station.pm25Value);

    //   if (pm25Value < minPm25Value) {
    //     minPm25Value = pm25Value;
    //     minPm25StationName = station.stationName;
    //   }
    // }

    // console.log(`${minPm25StationName}: ${minPm25Value}`);

    // 더 작은 값이 있는데 다른 지역 이름이 나와서 계속 다시 해본 건데
    // 확인하다 보니까 데이터를 일부만 받아오고 있는 거였다..


    // 3. `시도별 실시간 측정정보 조회`의 `서울`의 데이터를 `stationName`으로 접근하기 쉬운 자료구조로 재구성하시오. 
    const newStations = {};
    
    stations.forEach((station) => {
      newStations[`${station.stationName}`] = station;
    });

    // console.log(newStations);

    // 4. `종로구`의 `pm10Value`, `pm25Value`의 1달치 데이터를 정리하시오.
    const URL2 = `https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty?serviceKey=${APIKEY}&returnType=json&stationName=종로구&dataTerm=MONTH&ver=1.0`
    const response2 = await fetch(URL2);
    const data2 = await response2.json();
    const monthDatas = data2.response.body.items;

    console.log("pm10Value  pm25Value");
    monthDatas.forEach((data) => {
      console.log(`   ${data.pm10Value}         ${data.pm25Value}`);
    })
  } catch (error) {
    console.log(error);
  }
}

fetchDustInfo();



// 이유는 모르겠지만 응답값이 json 형태로 오지 않음
// => api키가 2종류인데 그중 적합하지 않은 키를 사용해서 라고 하심 (인코딩 문제)

// const baseURL = 'https://apis.data.go.kr/B552584/ArpltnInforInqireSvc'
// const path = '/getCtprvnRltmMesureDnsty';
// const params = new URLSearchParams({
//   // serviceKey: APIKEY, // 다른 api키 적용
//   serviceKey: APIKEY2,
//   returnType: 'json',
//   sidoName: '서울',
// });
// const URL = `${baseURL}${path}?${params}`;
  
  // API 환경 또는 API 호출 조건에 따라 인증키가 적용되는 방식이 다를 수 있습니다.
  // 포털에서 제공되는 Encoding/Decoding 된 인증키를 적용하면서 구동되는 키를 사용하시기 바랍니다.
// 이렇게 설명해둠;; 이렇게 만들면 안된다..