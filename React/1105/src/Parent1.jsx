import Child from "./Child"

export default function Parent1() {
  return (
    <div style={{
      border: "3px solid blue",
      margin: "10px",
      backgroundColor: "lightskyblue",
      textAlign: "center",
      color: "blue"
    }}>
      <div>Parent Component</div>
      <Child></Child>
      <Child></Child>
    </div>
  );
}