import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { Link, useNavigate } from "react-router-dom";
import axios from 'axios';

export default function PostList() {
  const navigate = useNavigate();

  // api를 사용하는 방식으로 대체
  // const posts = useSelector((state) => state.posts);

  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    async function fetchPosts() {
      try {
        const url = "http://localhost:3000/posts";
        const response = await axios.get(url);
        const data = response.data;
        
        setLoading(false);
        setPosts(data);
      } catch (err) {
        setError("오류 발생");
        setLoading(false);
      }
    }

    fetchPosts();
  }, []);

  if (loading) {
    return <div>로딩 중</div>
  }

  if (error) {
    return <div>{error}</div>
  }


  return (
    <div>
      <h2>posts</h2>
      <ul>
        {!loading && posts.map((post) => {
          const { id, title, content } = post;
          return (
            <li key={id}>
              <Link to={`/posts/${id}`} state={{ post }}>
                <h3>{title}</h3>
              </Link>
              <h3
                onClick={() => {
                  navigate(`/posts/${id}`);
                }}
              >
                {title}
              </h3>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
