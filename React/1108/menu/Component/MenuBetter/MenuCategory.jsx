import MenuCategoryItem from "./MenuCategoryItem";

export default function MenuCategory({ category, beverages }) {
  const menuList = beverages.map((beverage) => {
    return <MenuCategoryItem {...beverage}></MenuCategoryItem>;
  });

  return (
    <div>
      <h3>{category}</h3>
      <ul>{menuList}</ul>
    </div>
  );
}