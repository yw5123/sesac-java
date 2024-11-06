import Button from "./Button";
import CancleButton from "./CancleButton";
import Container from "./Container";

function App() {
  return (
    <>
      <Button color="blue" content="확인"></Button>
      <Button color="red" content="취소"></Button>
      <Button color="gray" content="보류"></Button>
      <Button color="pink" content="1억년"></Button>

      <CancleButton>취소</CancleButton>
      <CancleButton>금지</CancleButton>

      <Container>
        <Button color="pink" content="1억년"></Button>
      </Container>
    </>
  )
}

export default App;