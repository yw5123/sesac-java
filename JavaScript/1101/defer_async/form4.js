const form = document.querySelector('form');
      form.addEventListener('submit', async (e) => {
        e.preventDefault();
        const formData = new FormData(form);
        const objectData = Object.fromEntries(formData);

        const response = await fetch(
          'https://jsonplaceholder.typicode.com/posts',
          {
            method: 'POST',
            body: JSON.stringify(objectData),
            headers: {
              'Content-type': 'application/json; charset=UTF-8',
            },
          }
        );

        const data = await response.json();
        const { title, body } = data;

        const divTag = document.createElement('div');
        divTag.textContent = `${title} : ${body}`;
        document.querySelector('body').append(divTag);
      });