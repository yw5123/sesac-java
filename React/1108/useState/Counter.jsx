// 버튼을 클릭하면 숫자가 1 늘어난다
// 숫자는 0부터 시작
// (아마) 동작하지 않음 (정상임)

// 버튼을 클릭하면 숫자를 출력
// 동작함 (정상임)
import { useState } from 'react';

export default function Counter() {

  // let num = 0;
  const [num, setNum] = useState(0);

  return (
    <div style={{margin: 10}}>
      <div>{num}</div>
      <button onClick={() => {
        // num++;
        // setNum(num + 1);
        setNum(prev => prev + 1);
      }}>클릭 +</button>
      <button onClick={() => console.log(num)}>출력</button>
    </div>
  )
}