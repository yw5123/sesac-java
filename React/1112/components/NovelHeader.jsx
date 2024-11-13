import { Link } from "react-router-dom";

export default function NovelHeader() {
  return (
    <header class="myHeader sub">
      <ul>
        <li><Link to="romance">로맨스</Link></li>
        <li><Link to="fantasy">판타지</Link></li>
        <li><Link to="mystery">미스터리</Link></li>
        <li><Link to="drama">드라마</Link></li>
      </ul>
    </header>
  )
}