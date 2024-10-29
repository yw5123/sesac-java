// 변수 arr 을 선언하고 배열을 할당
const arr = [1, 3, 5, -3, 9, 10, 23, -6, 44, 22, -10, 5, 20];

// 3가지 방법으로 배열의 원소 출력
console.log(' -- 1 --');
arr.forEach((el) => console.log(el));

console.log(' -- 2 --');
for (let el of arr) {
  console.log(el);
}

console.log(' -- 3 --');
for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}