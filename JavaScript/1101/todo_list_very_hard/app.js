// npm install server.js
// node server.js

// --- 제공된 코드
// // API 베이스 URL
// const URL = 'http://localhost:3000/todos';

// // DOMContentLoaded : HTML 문서 로딩이 끝나면 실행되는 이벤트
// // 페이지가 로드되면 Todo 목록 초기화 함수를 실행한다.
// document.addEventListener('DOMContentLoaded', initTodos);

// async function initTodos() {
//   console.log('Hello World');
// }
// --- 

    
// API 베이스 URL
const URL = 'http://localhost:3000/todos';

// DOMContentLoaded : HTML 문서 로딩이 끝나면 실행되는 이벤트
// 페이지가 로드되면 Todo 목록 초기화 함수를 실행한다.
document.addEventListener('DOMContentLoaded', initTodos);

async function initTodos() {
  console.log('Hello TodoList!');

  setTodos();

  const addBtn = document.querySelector('#add-todo');
  addBtn.addEventListener('click', async function() {
    AddTodo();
  });
}

async function setTodos() {
  const response = await axios.get(URL);
  const todos = response.data;
  
  for (const todo of todos) {
    showTodo(todo);
  };
}

async function AddTodo() {
  const todoInput = document.querySelector('#todo-input');
  const todoText = todoInput.value;

  const newTodo = {
    content: todoText,
    completed: false,
  }

  const response = await axios.post(URL, newTodo);
  showTodo(response.data);
  todoInput.value = '';
}

function showTodo(data) {
  const { id, content, completed } = data;
  const todoUl = document.querySelector('#todo-list');

  const todoDiv = document.createElement('li');
  todoDiv.id = `todo${id}`;
  todoDiv.classList.add('todoLi');

  const todoText = document.createElement('span');
  todoText.textContent = content;
  if (completed) todoText.classList.add('completed');
  todoDiv.append(todoText);

  const btnDiv = document.createElement('div');
  btnDiv.classList.add('btnDiv');

  const completeBtn = document.createElement('button');
  completeBtn.textContent = '완료';
  completeBtn.addEventListener('click', function() {
    changeTodo(id);
  })
  btnDiv.append(completeBtn);


  const deleteBtn = document.createElement('button');
  deleteBtn.textContent = '삭제';
  deleteBtn.addEventListener('click', function() {
    deleteTodo(id);
  });
  btnDiv.append(deleteBtn);

  todoDiv.append(btnDiv);
  todoUl.append(todoDiv);
}

async function changeTodo(id) {
  const todo = document.querySelector(`#todo${id}`);

  // // 1. class에 completed가 있는지 여부로 판단
  // const isCompleted = todo.querySelector('span').classList.contains('completed');
  
  // 2. get method로 현재 completed 값을 받아와서 사용 => DB 관점에서는 더 좋음
  const responseGet = await axios.get(`${URL}/${id}`);
  const isCompleted = responseGet.data.completed;

  const response = await axios.patch(`${URL}/${id}`, {
    completed: !isCompleted
  });

  todo.querySelector('span').classList.toggle('completed');
}

async function deleteTodo(id) {
  const response = await axios.delete(`${URL}/${id}`);
  const todo = document.querySelector(`#todo${id}`);
  todo.remove();
}