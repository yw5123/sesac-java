import { useState } from 'react';

export default function InputPractice() {
  const [text, setText] = useState("");
  return (
    <div style={{margin: 10}}>
      <div style={{ 
        height: 100,
        border: "1px solid gray",
        padding: "0.5rem",
        backgroundColor: text,
      }}>{text}</div>
      <input type="text" onChange={(e) => {
        setText(e.target.value);
      }} />
    </div>
  )
}