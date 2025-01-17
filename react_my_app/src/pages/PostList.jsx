import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

import postApi from "../api/postsApi";

export default function PostList() {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    async function fetchPosts() {
      // 게시글 조회 로직
      try {
        // 정상 로직
        const response = await postApi.getPosts();
        const data = response.data;

        setPosts(data.data);
      } catch (err) {
        // 에러가 발생했을 시
        setError(err.message);
        console.error(err.responase);
      } finally {
        // 둘 다의 경우, 로딩이 끝남
        setLoading(false);
      }
    }

    fetchPosts();
  }, []);

  // if (loading) {
  //   return <div>로딩중</div>;
  // }

  // if (error) {
  //   return <div>{error}</div>;
  // }

  return (
    <div>
      <h2>Post List</h2>
      <ul>
        {posts.map((post) => {
          const { id, title } = post;
          return (
            <li key={id}>
              <Link to={`/posts/${id}`} state={{ post }}>
                <h3>
                  {id} : {title}
                </h3>
              </Link>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
