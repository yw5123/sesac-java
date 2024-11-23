# 백준 1012 유기농배추

import sys

input = sys.stdin.readline

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

T = int(input())

for _ in range(T):
    M, N, K = map(int, input().split())
    cabbages = set()
    for _ in range(K):
        c, r = map(int, input().split())
        cabbages.add((r, c))

    cnt = 0

    while cabbages:
        r, c = cabbages.pop()

        stack = [(r, c)]

        while stack:
            # 방문
            r, c = stack.pop()

            # 탐색
            for d in range(4):
                nr, nc = r + dr[d], c + dc[d]
                if (nr, nc) in cabbages:
                    stack.append((nr, nc))
                    cabbages.discard((nr, nc))

        cnt += 1

    print(cnt)
