import MenuCategory from "./MenuCategory"

export default function MenuBoard() {
  const beverages = {
    categories: ["coffee", "ade", "tea"],
    result: [
      { name: "아메리카노", price: "5.0/5.5", category: "coffee" },
      { name: "카페라떼", price: "6.0/6.5", category: "coffee" },
      { name: "바닐라라떼", price: "6.0/6.5", category: "coffee" },
      { name: "카라멜마끼아또", price: "6.5/7.0", category: "coffee" },
      { name: "레몬에이드", price: "6.0", category: "ade" },
      { name: "자몽에이드", price: "6.0", category: "ade" },
      { name: "유자에이드", price: "6.0", category: "ade" },
      { name: "녹차", price: "6.0", category: "tea" },
      { name: "홍차", price: "6.0", category: "tea" },
      { name: "유자차", price: "6.0", category: "tea" },
    ]
  }

  const { categories, result } = beverages;
  const beverageObject = {};

  categories.forEach((category) => {
    beverageObject[category] = result.filter((el) => el.category === category)
  });

  const beverageList = Object.entries(beverageObject);

  const beverageMenu = beverageList.map((el) => {
    const [category, beverages] = el;
    return <MenuCategory category={category} beverages={beverages}></MenuCategory>
  })

  return (
    <div style={{ width: "300px", margin: " 0 auto", textAlign: "center"}}>
      <h2>Menu</h2>
      <div>{beverageMenu}</div>
    </div>
  )
}