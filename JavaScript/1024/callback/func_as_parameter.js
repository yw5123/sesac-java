const applyOperation = (func, number) => {
  return func(number);
};

const double = (x) => x * 2;
const triple = (x) => x * 3;
const quadra = (x) => x * 4;

const functions = [double, triple, quadra];

for (let func of functions) {
  const result = applyOperation(func, 5);
  console.log(result);
}

// 이해가 안 되면 일단은 몰라도 됨