// TMDB API를 활용하여 다음 질문에 답하기
require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.TMDB_APIKEY;

const baseURL = 'https://api.themoviedb.org/3/movie';
const params = new URLSearchParams({
  api_key: APIKEY,
  language: 'ko',
});

async function getNowPlayingMovies() {
  try {
    const path = '/now_playing';
    const URL = `${baseURL}${path}?${params}`;

    const response = await fetch(URL);
    const data = await response.json();
    const movies = data.results;

    return movies;
  } catch (error) {
    console.log(error);
  }
}


function getPopularMovie(movies) {
  return movies.reduce((acc, cur) => acc.vote_average > cur.vote_average ? acc : cur );
}


async function getDetailMovie(movieId) {
  try {
    const path = `/${movieId}`;
    const URL = `${baseURL}${path}?${params}`;

    const response = await fetch(URL);
    const data = await response.json();

    return data;
  } catch (error) {
    console.log(error);
  }
}


function getOver7Movies(movies) {    
  return movies.filter((movie) => movie.vote_average >= 7)
}


function getImageUrl(posterPath) {
  return `https://image.tmdb.org/t/p/w200${posterPath}`;
}



async function main() {
  // 1. 현재 상영 중인 영화
  const movies = await getNowPlayingMovies();

  // 2. 그 중 가장 평점이 높은 영화
  const movie = getPopularMovie(movies);
  console.log(`1. 평점이 가장 높은 영화: ${movie.title}`);

  // 3. 그 영화의 디테일한 정보
  const detailMovie = await getDetailMovie(movie.id);
  console.log(`\n2. 평점이 가장 높은 영화의 수익: ${detailMovie.revenue}`);

  // 4. 1의 영화에 대하여, 평점이 7 이상인 영화를 담음 배열
  const over7Movies = getOver7Movies(movies);
  console.log("\n3. 평점이 7점 이상인 영화들")
  for(const movie of over7Movies) {
    console.log(movie.title);
  }

  const imageUrl = getImageUrl(detailMovie.poster_path);
  console.log(`\n4. 평점이 가장 높은 영화의 포스터 이미지: ${imageUrl}`);

}

main();