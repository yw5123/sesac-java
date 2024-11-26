from itertools import permutations

my_list = ["A", "B", "C"]
visited = [0, 0, 0]

# print(list(permutations(my_list, 2)))


def DFS(depth):
    if depth == 3:
        return

    for nxt in range(3):
        if not visited[nxt]:
            visited[nxt] = 1
            DFS(depth + 1)
            visited[nxt] = 0  # 다 돌고 나면 방문 체크 해제
