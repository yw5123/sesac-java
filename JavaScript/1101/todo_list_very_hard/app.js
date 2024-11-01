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
    showTodo(todo.id, todo.content, todo.completed);
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
  showTodo(response.data.id, todoText);
  todoInput.value = '';
}

function showTodo(id, content, completed = false) {
  const todoUl = document.querySelector('#todo-list');

  const todoDiv = document.createElement('div');
  todoDiv.id = `todo${id}`;
  todoDiv.classList.add('todoLi');

  const todoText = document.createElement('div');
  todoText.textContent = content;
  if (completed) todoText.classList.add('completed');
  todoDiv.append(todoText);

  const btnDiv = document.createElement('div');
  btnDiv.classList.add('btnDiv');

  const successBtn = document.createElement('button');
  successBtn.textContent = '완료';
  successBtn.addEventListener('click', function() {
    changeTodo(id, content);
  })
  btnDiv.append(successBtn);


  const deleteBtn = document.createElement('button');
  deleteBtn.textContent = '삭제';
  deleteBtn.addEventListener('click', function() {
    deleteTodo(id);
  });
  btnDiv.append(deleteBtn);

  todoDiv.append(btnDiv);
  todoUl.append(todoDiv);
}

async function changeTodo(id, content) {
  const todo = document.querySelector(`#todo${id}`);
  const completedStatus = todo.querySelector('div').classList.contains('completed');

  const changedTodo = {
    completed: !completedStatus
  }
  const response = await axios.patch(`${URL}/${id}`, changedTodo);

  todo.querySelector('div').classList.toggle('completed');
}

async function deleteTodo(id) {
  const response = await axios.delete(`${URL}/${id}`);
  const todo = document.querySelector(`#todo${id}`);
  todo.remove();
}