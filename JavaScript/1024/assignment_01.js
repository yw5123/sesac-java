// 배열 생성 - 변수 arr 선언하고 배열 할당
const arr = [1, 3, 5, -3, 9, 10, 23, -6, 44, 22, -10, 5, 20];


// 양수 출력 - 배열 함수 forEach() 활용
console.log("1. 양수 출력");

arr.forEach((num) => {
  if (num > 0) console.log(num);
})


// 곱하기 2 - 배열 함수 map() 활용
// 새로운 배열을 만들어 출력
console.log("\n2. 곱하기 2");

const mul2Nums = arr.map((num) => num * 2);
console.log(mul2Nums);


// 양수 홀수 배열 - 배열 함수 filter() 활용
// 새로운 배열을 만들어 출력
console.log("\n3. 양수 홀수 배열");

const oddPosNums = arr.filter((num) => {
  if (num > 0 && num % 2 ===1) return num
});
console.log(oddPosNums);


// 첫 번째 5 찾기 - 배열 함수 findIndex() 활용
console.log("\n4. 첫 번째 5 찾기");

const index1st5 = arr.findIndex((num) => {
  if (num === 5) return num;
})
console.log(index1st5);


// 배열 내 객체 출력하기 1 - 적절한 배열 함수 선택
// 배열 내 객체를 하나씩 출력
console.log("\n5. 배열 내 객체 출력하기 1");
const todos1 = [
  {
    "todoId": 1,
    "content": "예습하기",
    "isCompleted": false
  },
  {
    "todoId": 2,
    "content": "강의듣기",
    "isCompleted": false
  },
  {
    "todoId": 3,
    "content": "복습하기",
    "isCompleted": false
  }
];
todos1.forEach((todo) => console.log(todo));


// 배열 내 객체 출력하기 2 - 적절한 배열 함수 선택
// 배열 내 객체 중 isCompleted가 true인 객체만 출력
console.log("\n6. 배열 내 객체 출력하기 2");
const todos2 = [
  {
    "todoId": 1,
    "content": "예습하기",
    "isCompleted": false
  },
  {
    "todoId": 2,
    "content": "강의듣기",
    "isCompleted": true
  },
  {
    "todoId": 3,
    "content": "복습하기",
    "isCompleted": true
  }
];
todos2.filter((todo) => {
  if (todo.isCompleted === true) console.log(todo);
})



const matrix = [[4,2], [3,2], [5,7], [10,1]]

// 이차원 배열 출력 - 적절한 배열 함수 선택
// 내부 배열의 두 번째 원소만 출력
console.log("\n7. 이차원 배열 출력");
matrix.forEach((row) => console.log(row[1]))


// 이차원 배열의 합 - 적절한 배열 함수 선택
// 내부 배열의 원소 합이 짝수인 배열만 모아 새로운 이차원 배열 생성
console.log("\n8. 이차원 배열의 합");
const evenMatrix = matrix.filter((row) => {
  let sum = 0;
  for (let num of row) {
    sum += num;
  }
  if (sum % 2 === 0) return true;
})

console.log(evenMatrix);