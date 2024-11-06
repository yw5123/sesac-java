import Welcome from "./Welcome";
import Card from "./Card";
import Button from "./Button";
import Menu from "./menu/Menu";

function App() {
  return (
    <>
      <Welcome username="새싹"></Welcome>
      <Welcome username="잔디"></Welcome>
      <Card width={"100px"} height={"100px"}></Card>
      <Card width={"200px"} height={"200px"}></Card>
      <Button color={"blue"} content={"확인"}></Button>
      <Button color={"red"} content={"취소"}></Button>
      <Button color={"gray"} content={"보류"}></Button>
      <Button color={"pink"} content={"1억년"}></Button>

      <Menu></Menu>
    </>
  )
}

export default App;