export default function Button({ content, color }) {
  const buttonStyle = {
    margin: "5px",
    backgroundColor: color,
    color: "white"
  }
  return <button style={buttonStyle}>{content}</button>
}