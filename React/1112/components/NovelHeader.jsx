import { Link } from "react-router-dom";

export default function NovelHeader() {
  return (
    <header class="myHeader sub">
      <ul>
        <li><Link to="/novel/romance">로맨스</Link></li>
        <li><Link to="/novel/fantasy">판타지</Link></li>
        <li><Link to="/novel/mystery">미스터리</Link></li>
        <li><Link to="/novel/drama">드라마</Link></li>
      </ul>
    </header>
  )
}