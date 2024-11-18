import { Link } from "react-router-dom";

export default function WebtoonHeader() {
  const weekData = [
    { url: "mon", name: "월" },
    { url: "tue", name: "화" },
    { url: "wed", name: "수" },
    { url: "thu", name: "목" },
    { url: "fri", name: "금" },
    { url: "sat", name: "토" },
    { url: "sun", name: "일" },
  ]
  
  return (
    <header class="myHeader sub">
      <ul>
        {/* <li><Link to="mon">월요웹툰</Link></li>
        <li><Link to="tue">화요웹툰</Link></li>
        <li><Link to="wed">수요웹툰</Link></li>
        <li><Link to="thu">목요웹툰</Link></li>
        <li><Link to="fri">금요웹툰</Link></li>
        <li><Link to="sat">토요웹툰</Link></li>
        <li><Link to="sun">일요웹툰</Link></li> */}

        {weekData.map((el) => {
          return (
            <li>
              <Link to={el.url}>{el.name}요웹툰</Link>
            </li>
          )
        })}
      </ul>
    </header>
  )
}