import { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { useNavigate, useParams } from "react-router-dom";
import axios from 'axios';

export default function PostDetail() {
  const navigate = useNavigate();

  const { postId } = useParams();
  const [post, setPost] = useState();
  const [loading, setLoading] = useState(true);

  // api를 사용하는 방식으로 대체
  // const posts = useSelector((state) => state.posts);

  // useEffect(() => {
  //   setPost(posts.find((post) => post.id == parseInt(postId)));
  // });

  useEffect(() => {
    async function fetchPost() {
      try {
        const url = `http://localhost:3000/posts/${postId}`;
        const response = await axios.get(url);
        const data = response.data;
  
        setPost(data);
      } catch (err) {
        navigate("/posts");
      } finally {
        setLoading(false)
      }
    }

    fetchPost();
  }, []);

  if (loading) return <div>로딩 중</div>

  return (
    <div>
      detail
      <h3>{post?.title}</h3>
      <p>{post?.content}</p>
    </div>
  );
}
