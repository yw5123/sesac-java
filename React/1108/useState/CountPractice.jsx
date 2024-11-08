import { useState } from 'react';
import CountButton from './CountButton';

export default function CountPractice() {
  const [num, setNum] = useState(0);

  return (
    <div style={{margin: 10}}>
      <div>{num}</div>
      <CountButton onClick={() => setNum(num + 1)}>+</CountButton>
      <CountButton onClick={() => setNum(num - 1)}>-</CountButton>
    </div>
  )
}