import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { Link } from "react-router-dom";
import { login, logout } from "../store/slices/loginSlice";

export default function Header() {
  const { isLoggedIn } = useSelector((state) => state.login);
  const dispatch = useDispatch();

  function handleLogin(e) {
    if (e.target.text === '로그인') {
      dispatch(login());
    } else if (e.target.text === '로그아웃') {
      dispatch(logout());
    }
  }

  return (
    <header>
      <ul>
        <li>
          <Link to="/">Home으로</Link>
        </li>
        <li>
          <Link to="/posts">게시글로</Link>
        </li>
        <li style={{ display: !isLoggedIn&&"none" }}>
          <Link to="/posts/create">게시글 생성</Link>
        </li>
        <li>
          <a onClick={handleLogin}>{isLoggedIn ? "로그아웃" : "로그인"}</a>
        </li>
      </ul>
    </header>
  );
}
