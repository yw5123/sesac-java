import styles from "./Header.module.css"

export default function Header() {
  return (
    <header className={styles.myHeader}>
      <span>SESAC SHOP</span>
      <div>
        <span>HOME</span>
        <span>PRODUCTS</span>
      </div>
    </header>
  )
}