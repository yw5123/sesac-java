# SWEA 16268 풍선팡2
T = int(input())

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(N)]

    ans = 0

    for r in range(N):
        for c in range(M):
            tmp = matrix[r][c]
            for i in range(4):
                nr = r + dr[i]
                nc = c + dc[i]

                if 0 <= nr < N and 0 <= nc < M:
                    tmp += matrix[nr][nc]

            ans = max(ans, tmp)

    print(f"#{tc} {ans}")
