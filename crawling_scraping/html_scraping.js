// 1. 요청을 보낸다.
// 2. 응답을 받는다. (HTML)
// 3. HTML을 뜯어서 원하는 정보를 얻는다.

const axios = require('axios');
const { JSDOM } = require('jsdom');

const URL = "";

async function scrapingPractice() {
const response = await axios(URL);
const data = response.data;
const dom = new JSDOM(data);
const document = dom.window.document;

// article 태그들을 모두 선택
const articles = document.querySelectorAll('article');

// article 태그들을 반복 돌면서
articles.forEach((article) => {
  // 그 안의 a 태그들을 찾아서
  const aTags = article.querySelectorAll('a');
  // 그 안의 text를 출력
  aTags.forEach(aTag => console.log(aTag.textContent));
})
}

scrapingPractice();