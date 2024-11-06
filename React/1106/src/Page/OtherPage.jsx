import AdminPage from "./AdminPage";
import ManagerPage from "./ManagerPage";
import UserPage from "./UserPage";

export default function OtherPage({userType}) {
  let myPage
  if (userType === 'admin') {
    myPage = <AdminPage></AdminPage>
  } else if (userType === 'manager') {
    myPage = <ManagerPage></ManagerPage>
  } else if (userType === 'user') {
    myPage = <UserPage></UserPage>
  }

  // // 마찬가지로 삼항 연산도 가능
  // myPage = userType === 'admin' ? (<AdminPage></AdminPage>) : userType === 'manager' ? (<ManagerPage></ManagerPage>) : (<UserPage></UserPage>);
  
  return (
    <>
      <h2>나의 앱(Other Page)</h2>
      {myPage}
    </>
  )
}