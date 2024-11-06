import Son from "./Son";
import Daughter from "./Daughter";

export default function Parent2() {
  return (
    <div style={{
      border: "3px solid blue",
      margin: "10px",
      backgroundColor: "lightskyblue",
      textAlign: "center",
      color: "blue"
    }}>
      <div>Parent</div>
      <Son></Son>
      <Daughter></Daughter>
    </div>
  );
}