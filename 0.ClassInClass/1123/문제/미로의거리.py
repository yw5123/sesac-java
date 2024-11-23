# SWEA 5105 미로의 거리
from collections import deque

T = int(input())

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

for tc in range(1, T + 1):
    N = int(input())
    maze = [list(map(int, input())) for _ in range(N)]

    ######################
    # 세팅(출발지, 예정지, 기록지)
    flag = False

    for r in range(N):
        for c in range(N):
            if maze[r][c] == 2:
                sr, sc = r, c
                flag = True
                break
        if flag:
            break

    queue = deque([(sr, sc, -1)])
    visited = set([(sr, sc)])
    ans = 0

    # 예정지가 빌 때까지
    while queue:
        # 방문 (큐에서 뽑기)
        r, c, cnt = queue.popleft()

        # 도착지인지 검토
        if maze[r][c] == 3:
            ans = cnt
            break

        # 탐색 - 델타 탐색
        # 인접한 방향을 탐색해서
        for d in range(4):
            nr, nc = r + dr[d], c + dc[d]
            # 유효하고, 방문한 적 없고, 벽이 아니라면
            if (
                0 <= nr < N
                and 0 <= nc < N
                and (nr, nc) not in visited
                and maze[nr][nc] != 1
            ):
                # 방문 체크하고
                visited.add((nr, nc))
                # 방문 예정지에 넣기
                queue.append((nr, nc, cnt + 1))

    print(f"#{tc} {ans}")
