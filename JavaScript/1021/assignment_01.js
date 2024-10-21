// 배열의 원소 출력
const arr = [1, 2, 3, 4, 5];
for (let a of arr) {
  console.log(a);
}


// 원소의 제곱 출력
const arr2 = [1, 2, 3, 4, 5];
for (let a of arr2) {
  console.log(a**2);
}


// 원소가 짝수면 출력
const arr3 = [0, 1, 2, 3, 4, 5];
for (let a of arr3) {
  if (a > 0 && a % 2 === 0) {
    console.log(a);
  }
}


// 객체의 키와 값을 출력
let person = {
  name: '홍길동',
  age: 30,
  job: '개발자',
};
for(let key in person) {
  let value = person[key];
  console.log(`${key}, ${value}`);
}