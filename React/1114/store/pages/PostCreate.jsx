import { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux";
import { addPost } from "../store/slices/postsSlice";
import { useNavigate } from "react-router-dom";

export default function PostCreate() {
  const { isLoggedIn } = useSelector((state) => state.login);
  const [formData, setFormData] = useState({ title: "", content: "" });
  const dispatch = useDispatch();
  const navigate = useNavigate();

  useEffect(() => {
    if (!isLoggedIn) {
      navigate("/");
    }
  }, [isLoggedIn]);
  
  function handleChange(e) {
    setFormData({
        ...formData,
        [e.target.name]: e.target.value,
    });
  }

  function handleSubmit(e) {
    e.preventDefault();
    const id = Date.now();  // 임시 id
    dispatch(addPost({ ...formData, id }));
    navigate(`/posts/${id}`);
  }

  return (
    <>
      <h3>PostCreate</h3>
      <form onSubmit={handleSubmit}>
        <label htmlFor="title">제목: </label>
        <input 
          type="text" 
          name="title" 
          id="title" 
          onChange={handleChange}></input>

        <label>
          내용: 
          <textarea name="content" id="content" onChange={handleChange}></textarea>
        </label>

        <button>제출</button>
      </form>
    </>
  )
}