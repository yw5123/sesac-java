// 미세먼지(한국환경공단_에어코리아_대기오염정보)관련 API를 활용하여 다음 질문에 답하시오.
require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.DATAGO_KEY_EN;
const APIKEY2 = process.env.DATAGO_KEY_DE;

async function getDustInfo(baseURL, path, params) {
  const URL = `${baseURL}${path}?${params}`;
  const response = await fetch(URL);
  const data = await response.json();
  
  return data.response.body.items;
}

function filterNetworkError(data) {
  return data.filter((el) => {
    if (el.pm25Flag === '통신장애') return false;
    return true;
  })
}

async function main() {
  try {
    // `시도별 실시간 측정정보 조회`의 `서울`의 데이터에 대해, 초 미세먼지 농도가 가장 낮은 `stationName`을 찾으시오.
    const baseURL = 'https://apis.data.go.kr/B552584/ArpltnInforInqireSvc';
    const path = '/getCtprvnRltmMesureDnsty';
    const params = new URLSearchParams({
      serviceKey: APIKEY2,
      returnType: 'json',
      sidoName: '서울',
      ver: '1.0'
    });
    
    const stations = await getDustInfo(baseURL, path, params);
    const filteredStations = filterNetworkError(stations);

    const lowestStaion = filteredStations.reduce((acc, cur) => {
      if (parseInt(acc.pm25Value) > parseInt(cur.pm25Value)) return cur;
      else return acc;
    });

    console.log(`${lowestStaion.stationName}: ${lowestStaion.pm25Value}`);


    // `종로구`의 `pm10Value`, `pm25Value`의 1달치 데이터를 정리하시오.
    const path2 = '/getMsrstnAcctoRltmMesureDnsty';
    const params2 = new URLSearchParams({
      serviceKey: APIKEY2,
      returnType: 'json',
      stationName: '종로구',
      dataTerm: 'MONTH',
      ver: '1.0'
    }); 
    const monthData = await getDustInfo(baseURL, path2, params2);

    console.log("pm10Value  pm25Value");
    monthData.forEach((data) => {
      console.log(`   ${data.pm10Value}         ${data.pm25Value}`);
    })
  } catch (error) {
    console.log(error);
  }
}

main();

