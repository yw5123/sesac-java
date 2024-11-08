import Menu from "./Menu"

export default function MenuBoard() {
  // const coffees = [
  //   { menu: "아메리카노", price: "5.0/5.5" },
  //   { menu: "카페라떼", price: "6.0/6.5" },
  //   { menu: "바닐라라떼", price: "6.0/6.5" },
  //   { menu: "카라멜마끼아또", price: "6.5/7.0" },
  // ];

  // const mappedCoffees = coffees.map((coffee) => {
  //   return <Menu menu={coffee.menu} price={coffee.price}></Menu>
  // });

  // const ades = [
  //   { menu: "레몬에이드", price: "6.0" },
  //   { menu: "자몽에이드", price: "6.0" },
  //   { menu: "유자에이드", price: "6.0" },
  // ];

  // const mappedAdes = ades.map((ade) => {
  //   return <Menu menu={ade.menu} price={ade.price}></Menu>
  // });

  const beverages = [
    { name: "아메리카노", price: "5.0/5.5", category: "coffee" },
    { name: "카페라떼", price: "6.0/6.5", category: "coffee" },
    { name: "바닐라라떼", price: "6.0/6.5", category: "coffee" },
    { name: "카라멜마끼아또", price: "6.5/7.0", category: "coffee" },
    { name: "레몬에이드", price: "6.0", category: "ade" },
    { name: "자몽에이드", price: "6.0", category: "ade" },
    { name: "유자에이드", price: "6.0", category: "ade" },
  ]

  const mappedCoffees = beverages.filter((menu) => menu.category === "coffee").map((menu) => {
    const { name, price } = menu;
    return <Menu menu={name} price={price}></Menu>
  })
  
  const mappedAdes = beverages.filter((menu) => menu.category === "ade").map((menu) => {
    const { name, price } = menu;
    return <Menu menu={name} price={price}></Menu>
  })

  return (
    <div style={{ width: "300px", margin: " 0 auto", textAlign: "center"}}>
      <h2>Menu</h2>
      <h3>COFFEE</h3> <hr />
      <div>{mappedCoffees}</div>
      <h3>ADE</h3> <hr />
      <div>{mappedAdes}</div><br />
    </div>
  )
}