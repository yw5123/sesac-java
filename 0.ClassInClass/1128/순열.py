# from itertools import permutations
# cities = ["A", "B", "C", "D"]
# list(permutations(cities))
# 를 직접 구현해보자

cities = ["A", "B", "C"]
visited = [0, 0, 0]
ans = []


def perm(depth):
    # 도시 3개를 방문하면 종료 (= 인쇄실)
    if depth == 3:
        print(ans)
        return

    # 다음에 갈 곳을 탐색해서
    for idx in range(3):
        # 방문한 적이 없다면
        if not visited[idx]:
            # 방문 표시하고
            visited[idx] = 1
            # 방문
            ans.append(cities[idx])
            perm(depth + 1)

            # 방문 표시 해제 (중요)
            ans.pop()
            visited[idx] = 0


perm(0)
