export default function Card({ width, height }) {
  const cardStyle = {
    width,
    height,
    backgroundColor: 'lightblue'
  }
  return (
    <div style={cardStyle}>
      <h3>Title</h3>
      <p>Content</p>
    </div>
  )
}