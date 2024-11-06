import MenuPrice from "./MenuPrice"

export default function Menu() {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Menu</h1>
      <h2>COFFEE</h2><hr/>
      <div>
        <MenuPrice menu={"아메리카노"} price={"5.0/5.5"}></MenuPrice>
        <MenuPrice menu={"카페라떼"} price={"6.0/6.5"}></MenuPrice>
        <MenuPrice menu={"바닐라라떼"} price={"6.0/6.5"}></MenuPrice>
        <MenuPrice menu={"카라멜마끼아또"} price={"6.5/7.0"}></MenuPrice>
      </div>
      <h2>ADE</h2><hr/>
      <div>
        <MenuPrice menu={"레몬에이드"} price={"6.0"}></MenuPrice>
        <MenuPrice menu={"자몽에이드"} price={"6.0"}></MenuPrice>
        <MenuPrice menu={"유자에이드"} price={"6.0"}></MenuPrice>
      </div>
    </div>
  )
}