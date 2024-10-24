function add(x, y) {
  return x + y;
}

const value = add(1, 2);
console.log(value);

const func = add;

const value2 = func(1, 2);
console.log(value2);

// -----------------

function pi() {
  return 3.141592;
}

const piValue = pi();
const piFunc = pi;

console.log(piValue);
console.log(piFunc);
