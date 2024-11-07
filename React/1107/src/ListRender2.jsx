import Button from "./Button";
import Card from "./Card";

export default function ListRender2() {
  // 다음을 구현하시오. (문구와 색이 다른 버튼 4개)
  const buttons = [
    { text: "확인", backgroundColor: "lightblue" },
    { text: "취소", backgroundColor: "tomato" },
    { text: "보류", backgroundColor: "lightgray", color: "gray" },
    { text: "1억년", backgroundColor: "lightgreen", color: "green" },
  ];

  const mappedButtons = buttons.map((button) => {
    const { text, backgroundColor, color } = button;
    return <Button backgroundColor={backgroundColor} color={color}>{text}</Button>
  })

  // 가로, 세로 사이즈를 조절할 수 있는 title, content를 가지는 Card컴포넌트를 여러개 렌더링하시오.
  const sizes = [
    { width:"100px", height: "100px"},
    { width:"200px", height: "200px"},
    { width:"300px", height: "300px"},
  ]

  const mappedSizes = sizes.map((size) => {
    return <Card size={size}></Card>
  })

  return (
    <div>
      <div>{mappedButtons}</div><br />
      <div style={{display: "flex"}}>{mappedSizes}</div><br />
    </div>
  )
}