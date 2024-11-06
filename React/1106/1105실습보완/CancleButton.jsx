import Button from "./Button";

export default function CancleButton({children}) {
  return (
    <div>
      <Button color="red" content={children}></Button>
    </div>
  )
}