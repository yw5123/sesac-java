// 1. 40 이하의 3의 배수 출력
console.log("1. 40 이하의 3의 배수")

for (let i = 3; i <= 40; i += 3) {
  console.log(i);
}

// 3단 응용
// for (let num = 1; num * 3 <= 40; num += 3) {
//   console.log(num * 3);
// }


// 2. 1~100 중 7의 배수의 개수 출력
let num_7 = 0;
for (let i = 7; i <= 100; i += 7) {
  num_7++;
}
console.log(`\n2. 1~100 중 7의 배수 개수: ${num_7}`);

// 100 = a*7 + b 라고 했을 때 a가 7의 배수의 개수임을 이용
// num_7 = Math.floor(100 / 7)


// 3. arr 원소가 1, 4, 5, 7인 경우 제외하고 출력
console.log('\n3. arr 원소가 1, 4, 5, 7인 경우 제외')

const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7]
for (let num of arr) {
  if (num === 1 || num === 4 || num === 5 || num === 7) continue;
  
  console.log(num);
}

// Set을 활용하기
// const notLogSet = new Set([1, 4, 5, 7]);
// for (let num of arr) {
//   if (notLogSet.has(num)) continue;

//   console.log(num);
// }


// 4. 1~9 중 제곱한 수가 10 이상 50 이하인 자연수 리스트 출력
console.log('\n4. 1~9 중 제곱한 수가 10 이상 50 이하인 자연수 리스트')

let arr2 = [];
for (i = 0; i < 10; i++) {
  if (i**2 >= 10 && i**2 <= 50) arr2.push(i);
}
console.log(arr2);


// 5. 2개의 숫자에 대해 두 수 사이에 속한 모든 정수의 합 출력
const num1 = 2;
const num2 = 5;
let lower, higher, sum = 0;

if (num1 > num2) {
  higher = num1;
  lower = num2;
} else {
  higher = num2;
  lower = num1;
}

for (let i = lower; i <= higher; i++) {
  sum += i;
}
console.log(`\n5. 두 수 사이에 속한 모든 정수의 합: ${sum}`);


// 6. 2의 배수 혹은 3의 배수를 제외하고 1부터 30까지 숫자 출력
console.log('\n6. 2의 배수, 3의 배수를 제외한 수');

for (let i = 1; i <= 30; i++) {
  // if (i % 2 === 0) continue;
  // if (i % 3 === 0) continue;

  if (!(i % 2)) continue;
  if (!(i % 3)) continue;

  console.log(i);

  // 2의 배수도 아니고 3의 배수도 아니다
  // 이렇게도 작성 가능
  // if (i % 2 && i % 3) console.log(i);
}


// 7. 자연수 n이 주어졌을 때 n이 소수인지 판단
console.log('\n7. n이 소수인지 판단');

const n = 2;
let isPrime = true;

if (n === 1) isPrime = false;
// i <= n**(1/2)를 만족하지 않아서 for문이 돌아가지 않음!
// else if (n === 2) isPrime = true;
else {
  for (let i = 2; i <= n**(1/2); i++) {
    if (n % i === 0) {
      isPrime = false;
      break;
    }
  }
}

if (isPrime) console.log(`${n}은 소수입니다.`);
else console.log(`${n}은 소수가 아닙니다.`);


// 8. 테이블의 데이터를 people 변수에 저장
console.log('\n8. 테이블 데이터를 people 변수에 저장하고 출력')

const people = [
  {
    name: 'jun',
    age: 15,
    gender: 'M'
  },
  {
    name: 'ken',
    age: 26,
    gender: 'F'
  },
  {
    name: 'alex',
    age: 37,
    gender: null
  }
];

// 사람에 대한 정보를 각각 출력
for (const person of people) {
  // console.log(`이름: ${person.name}`);
  // console.log(`나이: ${person.age}`);
  // console.log(`성별: ${person.gender}`);
  for (let key in person) {
    console.log(key, person[key]);
  }
  console.log('-----');
}
// 이름이 alex인 사람에 대한 정보 출력
for (const person of people) {
  if (person.name === 'alex') console.log(person);
}

// 이름이 alex인 사람의 나이 출력
for (const person of people) {
  if (person.name === 'alex') console.log(`alex는 ${person.age}살`);
}

// 이름을 활용하여 각 사람의 데이터에 쉽게 접근할 수 있도록 people 변수 수정
console.log('\n이름을 활용하여 접근하기 쉽게 people 변수 수정')
const new_people = {
  jun: {
    name: 'jun',
    age: 15,
    gender: 'M'
  },
  ken: {
    name: 'ken',
    age: 26,
    gender: 'F'
  },
  alex: {
    name: 'alex',
    age: 37,
    gender: null
  }
}
// console.log(`alex의 정보: ${new_people['alex']}`);
// console.log(new_people['alex']);
console.log(`alex의 정보: ${new_people.alex}`);
console.log(new_people.alex);

// 하지만 동명이인은?
// 이 경우는 리스트로 작성하는 게 더 좋음
// 이렇게 작성하는 게 더 편하고 합리적인 경우가 있다!

const names = ['jun', 'ken', 'alex'];
const ages = [15, 26, 37];
const genders = ['M', 'F', null];

const arrayPeople = [names, ages, genders];

// 이런 형태로 저장됨
// arrayPeople = [
//   ['jun', 'ken', 'alex'],
//   [15, 26, 37],
//   ['M', 'F', null]
// ]

// names <- arrayPeople[0]
// 'ken' <- names[1] <- arrayPeople[0][1]