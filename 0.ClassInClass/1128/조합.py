cities = ["A", "B", "C"]
visited = [0, 0, 0]
ans = []


def perm(depth, idx):
    # 도시 3개를 방문하면 종료 (= 인쇄실)
    if depth == 3:
        print(ans)
        return

    # 다음에 갈 곳을 탐색해서
    for i in range(idx, 3):
        # 방문한 적이 없다면
        if not visited[i]:
            # 방문 표시하고
            visited[i] = 1
            # 방문
            ans.append(cities[i])
            perm(depth + 1, i)

            # 방문 표시 해제 (중요)
            ans.pop()
            visited[i] = 0


perm(0, 0)
