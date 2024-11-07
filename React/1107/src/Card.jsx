export default function Card(props) {
  const { width, height } = props.size;

  return <div style={{
    width, height, backgroundColor: "green"
  }}></div>
}