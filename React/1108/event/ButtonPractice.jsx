import Button from "./Button";

export default function ButtonPractice() {
  return (
    <div>
      <Button backgroundColor="blue" message="확인 완료">확인</Button>
      <Button backgroundColor="red" message="취소 완료">취소</Button>
      <Button backgroundColor="lightgray" message="보류 완료">보류</Button>
      <Button backgroundColor="pink" message="1억원을 얻었습니다">1억년</Button>
    </div>
  )
}