// 1. 변수 todos를 선언하고 빈 배열 할당
// 객체 정보를 기반으로 생성한 객체 3개를 todos에 추가
// 변수 todos를 출력

const todos = []

todos.push({
  "todoId": 1,
  "content": "예습하기",
  "isCompleted": false
});
todos.push({
  "todoId": 2,
  "content": "강의듣기",
  "isCompleted": false
});
todos.push({
  "todoId": 3,
  "content": "복습하기",
  "isCompleted": false
});

console.log(todos);

console.log('----------');
// 2. 1에서 만든 변수 todos를 활용하여
// 배열에 저장된 객체의 키 content와 isCompleted의 값을 출력하는 반복문 작성

for (let todo of todos) {
  console.log(`content: ${todo.content}, isCompleted: ${todo.isCompleted}`);
}

console.log('----------');
// 3. 1에서 만든 변수 todos를 활용하여
// 배열에 저장된 객체를 순회하는 반복문 작성하고
// 키 todoId의 값이 2인 객체를 찾아서 출력하는 조건문 작성

for (let todo of todos) {
  if (todo.todoId === 2) console.log(todo);
}


console.log('----------');
// 4. 1에서 만든 변수 todos를 활용하여
// 배역에 저장된 객체를 순회하는 반복문 작성하고
// 키 todoId의 값이 2인 객체의 키 isCompleted의 값을 true로 수정하는 조건문 작성
// 그 후 변수 todos를 출력

for (let todo of todos){
  if (todo.todoId === 2) todo.isCompleted = true;
}

console.log(todos);
