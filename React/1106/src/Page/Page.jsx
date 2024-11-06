import AdminPage from "./AdminPage";
import UserPage from "./UserPage";

export default function Page({userType}) {
  let myPage;

  if (userType === 'admin') {
    myPage = <AdminPage></AdminPage>;
  } else {
    myPage = <UserPage></UserPage>;
  }

  // // 삼항 연산자도 사용 가능
  // const isAdmin = userType === 'admin';
  // myPage = isAdmin ? <AdminPage></AdminPage> : <UserPage></UserPage>;
  // // return에 바로 작성도 가능

  return (
    <>
      <h2>나의 앱(Page)</h2>
      {myPage}
    </>
  )
}