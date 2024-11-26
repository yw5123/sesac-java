# 백준 7576 토마토

import sys

input = sys.stdin.readline

from collections import deque

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

M, N = map(int, input().split())

box = [[-1] * (M + 2) for _ in range(N + 2)]
for i in range(1, N + 1):
    box[i][1 : M + 1] = list(map(int, input().split()))

# 세팅(출발지, 기록지, 예정지)
queue = deque()
for r in range(1, N + 1):
    for c in range(1, M + 1):
        if box[r][c] == 1:
            queue.append((r, c))

# 예정지가 빌 때까지
while queue:
    # 방문
    r, c = queue.popleft()

    # 탐색 - 델타 탐색
    # 네 방향을 확인하며
    for d in range(4):
        # 새 좌표를 찍어보고
        nr, nc = r + dr[d], c + dc[d]
        # 유효한지 확인하고(범위, 안익은 토마토인지=0이고 방문x)
        if not box[nr][nc]:
            # 방문 체크하고
            box[nr][nc] += 1
            # 큐에 넣기
            queue.append((nr, nc))

# 다 익었는지 확인
cnt = 0
for row in box:
    if 0 in row:
        cnt = 0
        break
    cnt = max(cnt, *row)

# 얼마나 걸렸는지 확인
print(cnt - 1)
