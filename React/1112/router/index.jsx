import { createBrowserRouter } from "react-router-dom";
import RootLayout from "../pages/RootLayout";
import Home from "../pages/Home";
import WebtoonLayout from "../pages/WebtoonLayout";
import WebtoonMain from "../pages/WebtoonMain";
import WebtoonDay from "../pages/WebtoonDay";
import NovelLayout from "../pages/NovelLayout";
import NovelMain from "../pages/NovelMain";
import NovelGenre from "../pages/NovelGenre";

const router = createBrowserRouter([
  {
    path: "/",
    element: <RootLayout />,
    children: [
      {
        index: true,
        element: <Home />
      },
      {
        path: 'webtoon',
        element: <WebtoonLayout />,
        children: [
          {
            index: true,
            element: <WebtoonMain />
          },
          {
            path: ':day',
            element: <WebtoonDay />
          },
        ]
      },
      {
        path: 'novel',
        element: <NovelLayout />,
        children: [
          {
            index: true,
            element: <NovelMain />
          },
          {
            path: ':genre',
            element: <NovelGenre />
          },
        ]
      }
    ]
  },
  {

  }
])

export default router;