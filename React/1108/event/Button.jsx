export default function Button({ color="white", backgroundColor, message, children }) {

  return <button style={{ color, backgroundColor }} onClick={() => alert(message)}>{children}</button>
}