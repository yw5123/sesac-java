import { Navigate, useParams } from "react-router-dom"

export default function WebtoonDay() {
  const { day } = useParams();
  const weekData = new Set(["mon", "tue", "wed", "thu", "fri", "sat", "sun"]);
  
  if (!weekData.has(day)) {
    return <Navigate to="/webtoon" replace></Navigate>
  }

  let dayKorean
  switch (day) {
    case 'mon': dayKorean = '월'; break;
    case 'tue': dayKorean = '화'; break;
    case 'wed': dayKorean = '수'; break;
    case 'thu': dayKorean = '목'; break;
    case 'fri': dayKorean = '금'; break;
    case 'sat': dayKorean = '토'; break;
    case 'sun': dayKorean = '일'; break;
    default: console.log('잘못된 parameter 값입니다.');
  }
  return (
    <>
      <h2>{dayKorean}요일 웹툰</h2>
    </>
  )
}