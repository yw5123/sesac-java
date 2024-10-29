require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.TMDB_APIKEY;

// 현재 상영 중인 영화 리스트
async function getNowMovies() {
  try {
    const URL = `https://api.themoviedb.org/3/movie/now_playing?api_key=${APIKEY}`;
    const response = await fetch(URL);
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log(error);
  }
}

// 유명한 영화 리스트
async function getPopMovies() {
  try {
    const URL = `https://api.themoviedb.org/3/movie/popular?api_key=${APIKEY}`;
    const response = await fetch(URL);
    const data = await response.json();
    const movies = data.results;
    const movie = movies[0];

    // console.log(data);
    // console.log(movies.slice(0, 3));
    console.log(movie.title);
  } catch (error) {
    console.log(error);
  }
}

async function getMovies() {
  try {
    const baseURL = 'https://api.themoviedb.org/3/movie';

    // path 값을 함수의 매개변수로 받는 것도 좋음
    // const path = '/popular';
    const path = '/now_playing';
    
    // const params = `api_key=${APIKEY}`;
    const params = new URLSearchParams({
      api_key: APIKEY,
      language: 'ko',
    });
  
    const URL = `${baseURL}${path}?${params}`;
  
    const response = await fetch(URL);
    const data = await response.json();
    const movies = data.results;

    console.log(movies[0].title);
  } catch (error) {
    console.log(error);
  }
}


// getNowMovies();
// getPopMovies();
getMovies();