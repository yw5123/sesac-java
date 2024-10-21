// 1. 하고 싶은 동작 나열
// 2. 규칙성 찾기
// 3. 변화하는 규칙성을 container에 담기
// 4. container에서 하나씩 꺼내다가 하고 싶은 동작 실행

const names = ['jun', 'beemo', 'lynda'];

for (let index in names) {
  let name = names[index];
  console.log(`안녕 ${name}`);
}

const person = {
  name: 'jun',
  age: 18,
  gender: 'M'
};

for (let key in person) {
  let value = person[key];
  console.log(`${key}: ${value}`);
}