import { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { useNavigate, useParams } from "react-router-dom";
// import axios from 'axios';
import postApi from "../api/postsApi";

export default function PostDetail() {
  const navigate = useNavigate();

  const { postId } = useParams();
  const [post, setPost] = useState();
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function fetchPost() {
      try {
        // const url = `http://localhost:3000/posts/${postId}`;
        // const response = await axios.get(url);
        // const data = response.data;
        const data = await postApi.getPostById(postId);
  
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
