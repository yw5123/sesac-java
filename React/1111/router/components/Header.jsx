import { Link } from 'react-router-dom'

export default function Header() {
  return (
    <header>
      <ul>
        <li><Link to="/">Home으로 이동</Link></li>
        <li><Link to="/posts">게시글로 이동</Link></li>
      </ul>
    </header>

  )
}
