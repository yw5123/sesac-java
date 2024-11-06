// 로그인이 안 되어있는 경우 '로그인이 필요합니다'를 렌더링

export default function LoginCheck2({isLoggedIn}) {
  // if (!isLoggedIn) {
  //   return <div>로그인이 필요합니다.</div>
  // }
  // return null;

  // return (<>
  //   {isLoggedIn ? null : <div>로그인이 필요합니다.</div>}
  // </>)

  // 이 경우에는 논리 연산자가 적합
  return (<>
    {!isLoggedIn && <div>로그인이 필요합니다.</div>}
  </>)
}