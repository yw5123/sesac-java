export default function ListRender() {
  // 다음 데이터를 사용하여 이름 목록을 렌더링하시오.
  const names = ['김철수', '이영희', '박민수', '정지원', '최동욱'];

  const mappedNames = names.map((name) => {
    return <div>{name}</div>;
  })

  // 다음 사용자 데이터를 렌더링하시오.
  const users = [
    { id: 1, name: '김철수', age: 25, hobby: '독서' },
    { id: 2, name: '이영희', age: 28, hobby: '요리' },
    { id: 3, name: '박민수', age: 23, hobby: '게임' }
  ];

  const mappedUsers = users.map((user) => {
    const { id, name, age } = user;
    return <div>{id}. {name}({age}세) 취미는 {user.hobby}</div>;
  });

  // - 다음 제품 목록에서 가격이 30000원 이상인 제품을 렌더링하시오.
  const products = [
    { id: 1, name: '노트북', price: 55000 },
    { id: 2, name: '마우스', price: 15000 },
    { id: 3, name: '키보드', price: 45000 },
    { id: 4, name: '마우스패드', price: 8000 },
    { id: 5, name: '모니터', price: 150000 }
  ];

  const mappedProducts = products.filter((product) => product.price >= 30000).map((product) => {
    const { id, name, price } = product;
    return <div>{id}. {name} (가격: {price})</div>;
  })

  // 다음 이미지들을 렌더링하시오.
  const imgUrls = [
    "https://images.dog.ceo/breeds/gaddi-indian/Gaddi.jpg",
    "https://images.dog.ceo/breeds/terrier-westhighland/n02098286_3154.jpg",
    "https://images.dog.ceo/breeds/malamute/n02110063_16752.jpg",
    "https://images.dog.ceo/breeds/bulldog-english/jager-2.jpg",
  ];

  const mappedUrls = imgUrls.map((url) => {
    return <img src={url} height="100"></img>
  })

  return (
    <div>
      <div>{mappedNames}</div><br/>
      <div>{mappedUsers}</div><br/>
      <div>{mappedProducts}</div><br/>
      <div>{mappedUrls}</div><br/>
    </div>
  )
}