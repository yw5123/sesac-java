let state = 10;

if (state > 5) {
  let isHungry = true;
} else {
  let isHungry = false;
}

// console.log(isHungry); // 불가능

// --------------------------

function func() {
  let a = 1;
}

// console.log(a);  // 불가능

// 선언이 된 중괄호 {} 안에서만 접근 가능


const outerValue = '밖에 있는 값';

if (true) {
  console.log(outerValue);

  // const outerValue = "안에 있는 값"; // 불가능

  // outerValue를 내부에서 선언하지 않으면 밖에 있는 값을 출력하는데
  // 내부에서 선언하면 initialization 전에 접근할 수 없다고 뜸!

  const innerValue = "안에 있는 값";
}

// console.log(innerValue); // 불가능

const innerValue = "밖에 있는 값";
console.log(innerValue);



// global 환경에 변수 선언 -> 블럭 안에서 사용
// global 환경에 변수 선언 -> 블럭 안에서 변경
// global 환경에 변수 선언 -> 블럭 안에서 변경 -> global에서 사용
// global 환경에 변수 선언 -> 블럭 안에서 변수 선언

// global 환경에 변수 선언 -> 함수 안에서 사용
// global 환경에 변수 선언 -> 함수 안에서 변경
// global 환경에 변수 선언 -> 함수 안에서 변경 -> global에서 사용
// global 환경에 변수 선언 -> 함수 안에서 변수 선언