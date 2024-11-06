// CSS 모듈 사용
// import styles from "./assets/styles/Child.module.css"

export default function Child1() {
  return (
    // <div className={styles.container}>
    <div style={{
      width: "300px",
      height: "100px",
      border: "3px solid blue",
      margin: "10px",
      backgroundColor: "lightblue",
      textAlign: "center",
      color: "blue"
    }}>
      Child Component
    </div>
  )
}