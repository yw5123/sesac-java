export default function Container({children}) {
  return (
    <div style = {{
      width: "300px",
      height: "300px",
      border: "2px solid black",
      margin: "5px",
      display: "flex",
      justifyContent: "center",
      alignItems: "center"
    }}>
      {children}
    </div>
  )
}