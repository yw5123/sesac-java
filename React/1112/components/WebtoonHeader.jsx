import { Link } from "react-router-dom";

export default function WebtoonHeader() {
  return (
    <header class="myHeader sub">
      <ul>
        <li><Link to="/webtoon/mon">월요웹툰</Link></li>
        <li><Link to="/webtoon/tue">화요웹툰</Link></li>
        <li><Link to="/webtoon/wed">수요웹툰</Link></li>
        <li><Link to="/webtoon/thu">목요웹툰</Link></li>
        <li><Link to="/webtoon/fri">금요웹툰</Link></li>
        <li><Link to="/webtoon/sat">토요웹툰</Link></li>
        <li><Link to="/webtoon/sun">일요웹툰</Link></li>
      </ul>
    </header>
  )
}