// if문 사용
function Item({ name, isPacked }) {
  // if (isPacked) {
  //   return <li className="item">{name} ✅</li>;
  // }
  // return <li className="item">{name}</li>;
  if (isPacked) {
    return <li className="item" style={{color:'green'}}>{name} ✅</li>;
  }
  return <li className="item" style={{color:'gray'}}>{name}</li>;
}

// // 삼항 연산자 사용
// function Item({ name, isPacked }) {
//   // return <li className="item">{isPacked ? `${name} ✅` : name}</li>;

//   return  <>
//     {isPacked ? <li className="item" style={{color:'green'}}>{name} ✅</li> : <li className="item" style={{color:'gray'}}>{name}</li>}
//   </>
// }

// // 논리 연산자 사용
// // true false 2가지 경우에 대한 style 적용은 어려움
// function Item({ name, isPacked }) {
//   return <li className="item">{name} {isPacked && '✅'}</li>;
// }

export default function PackingList() {
  return (
    <section>
      <h1>Sally Ride's Packing List</h1>
      <ul>
        <Item 
          isPacked={true} 
          name="Space suit" 
        />
        <Item 
          isPacked={true} 
          name="Helmet with a golden leaf" 
        />
        <Item 
          isPacked={false} 
          name="Photo of Tam" 
        />
      </ul>
    </section>
  );
}
