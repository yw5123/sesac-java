import React from "react";
import Profile from "./Profile";

function AnotherComponent() {
  return <img src="https://cdn.royalcanin-weshare-online.io/XEAlJ4oBRYZmsWpctAuD/v5/maine-coon-kittens" alt="고양이" width="400px" />;
}

function App() {
  return (
    <div>
      <AnotherComponent></AnotherComponent>
      <AnotherComponent></AnotherComponent>
      <Profile></Profile>
    </div>
  );
}

export default App;