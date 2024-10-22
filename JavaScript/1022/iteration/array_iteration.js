names = ['jun', 'beemo', 'lynda'];

// for of
for (let name of names) {
  console.log(name);
}

// for in
for (let index in names) {
  let name = names[index];
  console.log(name, index);
}

// for
for (let index = 0; index < names.length; index++) {
  let name = names[index];
  console.log(name, index);
}

// while
let index = 0;
while (index < names.length) {
  let name = names[index];
  console.log(name, index);
  index++;
}

// while + break
let index_ = 0;
while (true) {
  let name = names[index_];
  console.log(name, index_);
  index_++;

  if (index_ === names.length) break;
}