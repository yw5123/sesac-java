async function readTodos() {
  /*
    GET /todos : 전체 리소스를 요청하는 엔드포인트
  */
  const response = await fetch("http://localhost:3000/todos");
  const todos = await response.json();
  return todos;
}

async function readTodosExample() {
  let response = await readTodos();
  console.log(response);
}


async function readTodo(id) {
  /*
    GET /todos/{id} : 특정 id 리소스를 요청하는 엔드포인트
  */
  const response = await fetch(`http://localhost:3000/todos/${id}`);
  const todo = await response.json();
  return todo;
}
async function readTodoExample() {
  let id = 1;
  let response = await readTodo(id);
  console.log(response);
}


async function createTodo(newTodo) {
  /*
    POST /todos : 리소스 생성을 요청하는 엔드포인트
  */
  const response = await fetch("http://localhost:3000/todos", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    // body : 생성할 리소스 정보를 전송
    body: JSON.stringify(newTodo),
  });
  const todo = await response.json();
  return todo;
}

async function createTodoExample() {
  /*
    newTodo : 생성할 리소스 정보
  */
  let newTodo = {
    id: 4,
    content: "낮잠 자기",
    completed: false,
  };

  let response = await createTodo(newTodo);
  console.log(response);
}


async function updateTodo(id, todo) {
  /*
    PUT /todos : 특정 id 리소스 수정
  */
  const response = await fetch(`http://localhost:3000/todos/${id}`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    // body : 수정할 리소스 정보를 전송
    body: JSON.stringify(todo),
  });
  const updatedTodo = await response.json();
  return updatedTodo;
}

async function updateTodoExample() {
  /*
    todo : 수정 리소스 정보
    id : 수정할 리소스 id
  */
  let todo = {
    id: 2,
    content: "강의 듣기",
    completed: false,
  };

  let id = 2;
  let response = await updateTodo(id, todo);
  console.log(response);
}


async function deleteTodo(id) {
  /*
    DELETE /todos/{id} : 특정 id 리소스 삭제
  */
  const response = await fetch(`http://localhost:3000/todos/${id}`, {
    method: "DELETE",
  });
  if (response.ok) {
    console.log(`ID ${id} 삭제 완료`);
  }
}

async function deleteTodoExample() {
  /*
    id : 삭제할 리소스 id
  */
  let id = 1;
  await deleteTodo(id);
}



readTodosExample();
readTodoExample();
createTodoExample();
updateTodoExample();
deleteTodoExample();