import React from "react";
import { useSelector } from "react-redux";
import { useLocation, useParams } from "react-router-dom";

export default function PostDetail() {
  const { postId } = useParams();
  const posts = useSelector((state) => state.posts);

  const [post, setPost] = useState();

  return (
    <div>
      detail
      <h3>{post.title}</h3>
      <p>{post.content}</p>
    </div>
  );
}
