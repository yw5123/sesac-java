export default function MenuPrice({ menu, price }) {
  return (
    <div style={{ display: "flex", justifyContent: "space-around" }}>
      <span>{menu}</span>
      <span>{price}</span>
    </div>
  )
}