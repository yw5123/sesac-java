console.log(add(1, 2));
// console.log(add2(1, 2)); // 불가능
// console.log(add3(1, 2)); // 불가능

function add(x, y) {
  return x + y;
};

const add2 = function (x, y) {
  return x + y;
};

const add3 = (x, y) => {
  return x + y;
}

// -------------------------

const person = {
  name: '철수',
  greet: function() {
    console.log('안녕하세요. 반갑습니다.');
  },
  greet2() {
    console.log('안녕하세요. 반갑습니다.');
    console.log(`${this.name}`);
  }
}

console.log(person.name);
person.greet();
person.greet2();