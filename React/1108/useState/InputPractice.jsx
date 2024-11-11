import { useState } from 'react';

export default function InputPractice() {
  const [text, setText] = useState("");
  
  // placeholder처럼 div에 입력하면 동기화된다는 안내를 넣어보기

  // const [text, setText] = useState("입력하면 여기에 동기화");
  // 한번 입력하고 나면 사라짐

  return (
    <div style={{margin: 10}}>
      <input type="text" onChange={(e) => {
        setText(e.target.value);
      }} />

      {/* {!text && <div>입력하면 여기에 동기화</div>} */}
      {/* 태그가 갈아끼워짐 */}
      {/* 근데 나는 인라인 태그를 넣어놔서.. */}

      <div style={{ 
        height: 100,
        border: "1px solid gray",
        padding: "0.5rem",
        backgroundColor: text,
      }}>{text ? text : "입력하면 여기에 동기화"}</div>
    </div>
  )
}