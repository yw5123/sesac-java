import { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux";
import { addPost } from "../store/slices/postsSlice";
import { useNavigate } from "react-router-dom";
// import axios from 'axios';
import postApi from "../api/postsApi";

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

    async function createPost() {
      // const url = "http://localhost:3000/posts";
      // const response = await axios.post(url, formData);
      // const data = response.data;
      const data = await postApi.createPost(formData);

      const id = data.id;
      navigate(`/posts/${id}`);
    }
    createPost();
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