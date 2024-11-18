import { Outlet } from "react-router-dom";
import Header from "../components/Header";

export default function RootLayout() {
  return (
    <>
      <Header></Header>
      <Outlet></Outlet>
      <footer class="myFooter">SeSAC KoHo 2024 ⓒAll Rights Reserved</footer>
    </>
  )
}