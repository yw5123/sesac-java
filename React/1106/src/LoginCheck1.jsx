// 로그인 여부에 따라 "환영합니다!" / "로그인이 필요합니다."를 렌더링

export default function LoginCheck1({isLoggedIn}) {
  if (isLoggedIn) {
    return <div>환영합니다!</div>
  }
  return <div style={{ color: "red" }}>로그인이 필요합니다.</div>

  // 현재는 <div> 안의 내용만 바뀌니까 삼항 연산자 사용 가능
  // return <div>{isLoggedIn ? "환영합니다!" : "로그인이 필요합니다."}</div>

  // 논리 연산자는 사용하기 애매함 (가능하긴 함)
  // return (
  //   <>
  //     {isLoggedIn && "환영합니다!"}
  //     {!isLoggedIn && "로그인이 필요합니다."}
  //   </>
  // )
}