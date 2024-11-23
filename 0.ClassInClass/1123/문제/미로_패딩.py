# SWEA 4875 미로

T = int(input())

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def DFS(r, c):
    global ans
    # 방문
    if maze[r][c] == 3:
        ans = 1
        return

    maze[r][c] = 1

    # 탐색 - 델타 탐색
    for d in range(4):
        # 새로운 좌표 찍어보기
        nr, nc = r + dr[d], c + dc[d]

        if maze[nr][nc] != 1:
            # 유효하다면?
            # 방문
            DFS(nr, nc)


for tc in range(1, T + 1):
    N = int(input())

    # # 패딩 감싸기 => 유효성 검사에서 범위 검사는 안 해도 됨 & 탐색 범위도 range(1, N+1)
    maze = [[1] * (N + 2) for _ in range(N + 2)]
    for i in range(1, N + 1):
        maze[i][1 : N + 1] = list(map(int, input()))

    ans = 0

    ####################
    # 세팅(출발지, 예정지, 기록지)
    flag = False

    for r in range(N + 1):
        for c in range(N + 1):
            if maze[r][c] == 2:
                sr, sc = r, c
                flag = True
                break
        if flag:
            break

    DFS(sr, sc)
    print(f"#{tc} {ans}")
