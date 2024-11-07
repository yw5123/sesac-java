export default function Menu(props) {
  const { menu, price } = props;
  return <div style={{ 
    display: "flex",
    justifyContent: "space-between"
  }}><span>{menu}</span><span>{price}</span></div>
}