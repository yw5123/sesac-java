import { useState } from 'react';
import CountButton from './CountButton';

export default function CountPractice() {
  const [num, setNum] = useState(0);

  return (
    <div style={{margin: 10}}>
      <div>{num}</div>
      <CountButton onClick={() => setNum(num + 1)}>+</CountButton>
      <CountButton onClick={() => setNum(num - 1)}>-</CountButton>
      {/* 이렇게 적거나 함수로 빼는 것도 가능 */}
      {/* <CountButton onClick={() => setNum((prevNum) => prevNum - 1)}>-</CountButton> */}
    </div>
  )
}