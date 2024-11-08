export default function MenuCategoryItem({ name, price }) {
  return <li style={{ 
    display: "flex",
    justifyContent: "space-between"
  }}><span>{name}</span><span>{price}</span></li>
}