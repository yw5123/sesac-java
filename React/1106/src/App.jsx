import PackingList from "./PackingList"
import LoginCheck1 from "./LoginCheck1"
import LoginCheck2 from "./LoginCheck2";
import Page from "./Page/Page";
import OtherPage from "./Page/OtherPage";

function App() {
  const isLoggedIn = true;  // true, false
  const userType = 'user'; // admin, user, manager

  return (
    <>
      <LoginCheck1 isLoggedIn={isLoggedIn}></LoginCheck1>
      <LoginCheck2 isLoggedIn={isLoggedIn}></LoginCheck2>
      
      {isLoggedIn && <>
        <Page userType={userType}></Page>
        <OtherPage userType={userType}></OtherPage>
      </>}
      
      <PackingList></PackingList>
    </>
  )
}

export default App
