import MenuCategory from "./MenuCategory"

export default function MenuBoard() {
  const beverages = [
    { name: "아메리카노", price: "5.0/5.5", category: "coffee" },
    { name: "카페라떼", price: "6.0/6.5", category: "coffee" },
    { name: "바닐라라떼", price: "6.0/6.5", category: "coffee" },
    { name: "카라멜마끼아또", price: "6.5/7.0", category: "coffee" },
    { name: "레몬에이드", price: "6.0", category: "ade" },
    { name: "자몽에이드", price: "6.0", category: "ade" },
    { name: "유자에이드", price: "6.0", category: "ade" },
  ]

  const coffee = beverages.filter((menu) => menu.category === "coffee")
  
  const ade = beverages.filter((menu) => menu.category === "ade")

  return (
    <div style={{ width: "300px", margin: " 0 auto", textAlign: "center"}}>
      <h2>Menu</h2>
      <div>
        <MenuCategory category={"COFFEE"} beverages={coffee}></MenuCategory>
        <MenuCategory category={"ADE"} beverages={ade}></MenuCategory>
      </div>
    </div>
  )
}