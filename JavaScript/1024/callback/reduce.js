const nums = [1, 2, 3, 4];

const mulNums = nums.reduce((acc, cur) => {
  console.log(acc, cur);  // 어떻게 동작하는지 확인
  return acc * cur;
}, 1);

// 한줄로 작성하면..
// const mulNums = nums.reduce((acc, cur) => acc * cur);

console.log(mulNums);



// reduce를 사용해 minValue 계산하기
const numbers = [-1, 5, 8, 2, 5, 9, 4];

const minValue1 = numbers.reduce((acc, cur) => {
  // console.log(acc, cur);  // 어떻게 동작하는지 확인
  if (acc > cur) return cur;
  else return acc;
}, Infinity); // 값(Infinity)을 안 넣으면 5 8로 시작하고, 넣으면 Infinity 5로 시작함?
// 값을 넣으면 초기값이 값으로 지정되고 안 넣으면 배열의 첫번째 값으로 지정된다!

const minValue2 = numbers.reduce((acc, cur) => acc > cur? cur: acc);

const minValue3 = numbers.reduce((acc, cur) => acc > cur? cur: acc, Infinity);
const minValue3_ = numbers.reduce((acc, cur) => (acc > cur? cur: acc), Infinity);
// const minValue3 = numbers.reduce((acc, cur) => {acc > cur? cur: acc}, Infinity);
// 괄호를 안 쓰거나 ()를 썼어야 되는데 {}를 써서 오류가 발생한 거였다

console.log(`minValue: ${minValue1}`);
console.log(`minValue: ${minValue2}`);
console.log(`minValue: ${minValue3}`);