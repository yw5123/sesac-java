// 미세먼지(한국환경공단_에어코리아_대기오염정보)관련 API를 활용하여 다음 질문에 답하시오.
require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.DATAGO_KEY;

// async function 


async function main() {
  try {
    // 1. `시도별 실시간 측정정보 조회`에서 확인 가능한 시도 이름을 전부 작성하시오.
    console.log("전국, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종");

    // 2. `시도별 실시간 측정정보 조회`의 `서울`의 데이터에 대해, 초 미세먼지 농도가 가장 낮은 `stationName`을 찾으시오.
    const URL = `https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey=${APIKEY}&returnType=json&sidoName=서울&ver=1.0`
    const response = await fetch(URL);
    const data = await response.json();
    const stations = data.response.body.items;

    const lowestStaion = stations.reduce((acc, cur) => acc.pm25Value > cur.pm25Value ? acc: cur);
    console.log(lowestStaion.stationName);

    // 3. `시도별 실시간 측정정보 조회`의 `서울`의 데이터를 `stationName`으로 접근하기 쉬운 자료구조로 재구성하시오. 
    const newStations = {};
    
    stations.forEach((station) => {
      newStations[`${station.stationName}`] = station;
    });

    // console.log(newStations);

    // 4. `종로구`의 `pm10Value`, `pm25Value`의 1달치 데이터를 정리하시오.
    const URL2 = `https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty?serviceKey=${APIKEY}&returnType=json&numOfRows=719&stationName=종로구&dataTerm=MONTH&ver=1.0`
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

main();


// 이유는 모르겠지만 응답값이 json 형태로 오지 않음
    // const baseURL = 'https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty'
    // const params = new URLSearchParams({
    //   serviceKey: APIKEY,
    //   returnType: 'json',
    //   sidoName: '서울',
    // });
    // const URL = `${baseURL}?${params}`;