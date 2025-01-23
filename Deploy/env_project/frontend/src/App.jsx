import { useEffect, useState } from "react";
import axios from "axios";

export default function App() {
  // API 서버의 주소(VITE_API_URL)를 환경 변수로 대체한다.
  const API_URL = "http://localhost:8080/api/";

  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios
      .post(`${API_URL}articles`, {
        title: "제목",
        content: "내용",
      })
      .then((res) => {});

    axios.get(`${API_URL}articles`).then((res) => {
      setPosts(res.data);
    });
  }, []);

  return (
    <div>
      {posts.map((post) => {
        return (
          <div>
            <h3>{post.title}</h3>
            <p>{post.content}</p>
          </div>
        );
      })}
    </div>
  );
}
