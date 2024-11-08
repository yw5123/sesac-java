import React from 'react'

export default function EventPractice() {
  function handleClick() {
    alert("버튼 클릭");
  }

  function changeBackgroundColor(target, color) {
    target.style.backgroundColor = color;
  }

  return (
    <div>
      <button onClick={() => {alert("버튼 클릭")}}>클릭</button>
      <button onClick={handleClick}>클릭</button>

      <div style={{width: 100, height: 100, border: "1px solid black"}} 
        onMouseEnter={(e) => {
          changeBackgroundColor(e.target, "black");
        }}
        onMouseLeave={(e) => {
          changeBackgroundColor(e.target, "white");
        }}
      ></div>

      <input type="text" onChange={(e) => {
        console.log(e.target.value);
      }} />
    </div>
  )
}
