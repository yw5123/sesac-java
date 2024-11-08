import { useState } from 'react'
import styles from './like.module.css'

export default function LikePractice() {
  const [isLike, setIsLike] = useState(false)

  return(
    <div style={{margin: 10}}>
      <button onClick={(e) => {
        setIsLike(isLike ? false : true);
        e.target.className = isLike ? styles.isLike : styles.isNotLike;
      }}>{isLike ? "좋아요 취소" : "좋아요"}</button>
    </div>
  )
}