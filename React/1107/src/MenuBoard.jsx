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

  const menus = [
    { name: "아메리카노", price: "5.0/5.5", type: "coffee" },
    { name: "카페라떼", price: "6.0/6.5", type: "coffee" },
    { name: "바닐라라떼", price: "6.0/6.5", type: "coffee" },
    { name: "카라멜마끼아또", price: "6.5/7.0", type: "coffee" },
    { name: "레몬에이드", price: "6.0", type: "ade" },
    { name: "자몽에이드", price: "6.0", type: "ade" },
    { name: "유자에이드", price: "6.0", type: "ade" },
  ]

  const mappedCoffees = menus.filter((menu) => menu.type === "coffee").map((menu) => {
    const { name, price } = menu;
    return <Menu menu={name} price={price}></Menu>
  })
  
  const mappedAdes = menus.filter((menu) => menu.type === "ade").map((menu) => {
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