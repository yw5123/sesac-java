import ListRender from "./ListRender";
import ListRender2 from "./ListRender2";
import MenuBoard from "./MenuBoard";
import Page from "./myPage/Page";

function App() {
  return (
    <>
      <ListRender></ListRender>
      <ListRender2></ListRender2>
      <MenuBoard></MenuBoard>
      <div style={{ width: "600px", height: "600px", border: "1px solid black", margin: "10px"}}>
       <Page></Page>
      </div>
    </>
  )
}

export default App
