// 변수 x를 선언하고 임의의 숫자값 할당 후 출력
const x = 5;
console.log(x);

// 변수 arr 을 선언하고 배열을 할당
const arr = [1, 3, 5, -3, 9, 10, 23, -6, 44, 22, -10, 5, 20];

const newArr = arr.filter((el) => {
  if (el > x) return true;
});

console.log(newArr);