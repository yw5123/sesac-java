// fetch('https://jsonplaceholder.typicode.com/posts/1')
//   .then((response) => response.json())
//   .then((json) => {
//     // console.log(json);
//     const title = json.title;
//     console.log(title);
//   })
//   .catch((error) => console.error(error));

async function getPostById(postId) {
  const response = await fetch(
    `https://jsonplaceholder.typicode.com/posts/${postId}`
  );
  const data = await response.json();
  console.log(data);
}

async function getPosts() {
  const response = await fetch(`https://jsonplaceholder.typicode.com/posts`);
  const data = await response.json();
  // data.forEach((value) => {
  //   console.log(value.title);
  // });
  const titles = data.map((value) => value.title);
  console.log(titles);
  // console.log(data);
}

async function createPost() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/posts', {
      method: 'POST',
      body: JSON.stringify({
        title: 'asd',
        body: 'bar',
        userId: 1,
      }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    });

    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error('Error:', error);
  }
}

// createPost();

async function updatePost() {
  try {
    const response = await fetch(
      'https://jsonplaceholder.typicode.com/posts/1',
      {
        method: 'PUT',
        body: JSON.stringify({
          id: 1,
          title: 'foo',
          body: 'bar',
          userId: 1,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      }
    );
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error('Error:', error);
  }
}

// createPost();
// updatePost();

async function deletePost() {
  const response = await fetch('https://jsonplaceholder.typicode.com/posts/1', {
    method: 'DELETE',
  });
  const text = await response.text();
  console.log(text);
}

// deletePost();