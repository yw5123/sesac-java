import Header from "./Header"
import Body from "./Body"
import Footer from "./Footer"

import styles from "./Page.module.css"

export default function Page() {
  return (
    <div className={styles.container}>
      <Header></Header>
      <Body></Body>
      <Footer></Footer>
    </div>
  )
}