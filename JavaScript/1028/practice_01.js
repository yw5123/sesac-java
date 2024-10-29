// TMDB API를 활용하여 다음 질문에 답하기
require('dotenv').config({ path: "../../.env" });
const APIKEY = process.env.TMDB_APIKEY;


async function getMoviesByVoteAverage() {
  try {
    const baseURL = 'https://api.themoviedb.org/3/movie';
    const params = new URLSearchParams({
      api_key: APIKEY,
      language: 'ko',
    });
    

    // 1. 현재 상영 중인 영화 중 평점(`vote_average`)이 가장 높은 영화를 찾으시오.
    let path = '/now_playing';
    let URL = `${baseURL}${path}?${params}`;

    const response = await fetch(URL);
    const data = await response.json();
    const movies = data.results;
    
    const hightestMovie = movies.reduce((acc, cur) => acc.vote_average > cur.vote_average ? acc : cur );
    // acc.vote_average === cur.vote_average 일 때 다른 추가 기준을 판단하게 할 수도 있음

    console.log(`1. 평점이 가장 높은 영화: ${hightestMovie.title}`);


    // 2. 현재 상영 중인 영화 중 평점(`vote_average`)이 가장 높은 영화의 수익(`revenue`)를 찾으시오.
    path = `/${hightestMovie.id}`;
    URL = `${baseURL}${path}?${params}`;

    const response2 = await fetch(URL);
    const movieDetails = await response2.json();

    console.log(`\n2. 평점이 가장 높은 영화의 수익: ${movieDetails.revenue}`);


    // 3. 현재 상영 중인 영화 중 평점(`vote_average`)이 `7` 이상인 영화를 나열하시오.
    console.log("\n3. 평점이 7점 이상인 영화들")
    movies.forEach((movie) => {
      if(movie.vote_average >= 7) console.log(movie.title);
    })


    // 4. 현재 상영 중인 영화 중 평점(`vote_average`)이 가장 높은 영화의 포스터 이미지를 조회하시오.
    path = `/${hightestMovie.poster_path}`;
    URL = `https://image.tmdb.org/t/p/w200${path}`;

    console.log(`\n4. 평점이 가장 높은 영화의 포스터 이미지: ${URL}`);
  } catch (error) {
    console.log(error);
  }
}

getMoviesByVoteAverage();
