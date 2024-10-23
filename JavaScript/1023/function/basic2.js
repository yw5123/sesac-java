function add(a, b) {
  return a + b;
}

console.log(add(4, 2));
console.log(add(10, 7));


// 입력값에 default 값 지정 가능
function greet(name = 'Guest') {
  console.log(`안녕하세요, ${name}님!`);
}

greet('세계');
greet();


// 여러개의 인수를 배열로 받을 수 있음
function sum(...nums) {
  let total = 0;
  
  for (let num of nums) {
    total += num;
  }

  return total;
}

console.log(sum(1, 2, 3, 4, 5, 6, 7));