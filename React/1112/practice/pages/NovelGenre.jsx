import { useParams } from "react-router-dom"

export default function NovelGenre() {
  const { genre } = useParams();

  let genreKorean
  switch (genre) {
    case 'romance': genreKorean = '로맨스'; break;
    case 'fantasy': genreKorean = '판타지'; break;
    case 'mystery': genreKorean = '미스터리'; break;
    case 'drama': genreKorean = '드라마'; break;
    default: console.log('잘못된 parameter 값입니다.');
  }
  return (
    <>
      <h2>{genreKorean} 소설</h2>
    </>
  )
}