import { useState } from 'react'
import styles from './like.module.css'

export default function LikePractice() {
  const [isLiked, setIsLiked] = useState(false)

  return(
    <div style={{margin: 10}}>
      <button 
        className={isLiked ? styles.isLike : styles.isNotLike}
        onClick={(e) => {
          // setIsLiked(isLiked ? false : true);
          setIsLiked((prev) => !prev);

          // e.target.className = isLiked ? styles.isLiked : styles.isNotLiked;
      }}>{isLiked ? "좋아요 취소" : "좋아요"}</button>
    </div>
  )
}