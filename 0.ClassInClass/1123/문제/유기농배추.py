# 백준 1012 유기농배추

import sys

input = sys.stdin.readline

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

T = int(input())


def DFS(r, c):
    # 방문

    # 탐색 - 델타 탐색
    # 네 방향을 보면서
    for d in range(4):
        nr, nc = r + dr[d], c + dc[d]
        # 범위 유효성 + 1이라면?
        if (
            0 <= nr < N
            and 0 <= nc < M
            and (nr, nc) not in visited
            and field[nr][nc] == 1
        ):
            # 방문 체크하고
            visited.add((nr, nc))
            # 방문
            DFS(nr, nc)


for _ in range(T):
    M, N, K = map(int, input().split())
    field = [[0] * M for _ in range(N)]

    for _ in range(K):
        c, r = map(int, input().split())
        field[r][c] = 1

    visited = set()
    ans = 0

    # 순회하며
    for r in range(N):
        for c in range(M):
            # 1이고 방문한 적 없다면?
            if field[r][c] == 1 and (r, c) not in visited:
                # DFS 또는 BFS
                visited.add((r, c))
                DFS(r, c)
                # 정답 +1
                ans += 1

    print(ans)
