# SWEA 2001 파리 퇴치

T = int(input())

for tc in range(1, T + 1):
    N, M = map(int, input().split())

    flies = [list(map(int, input().split())) for _ in range(N)]
    maxFlies = 0

    for r in range(N - M + 1):
        for c in range(N - M + 1):
            killedFlies = 0
            for y in range(r, r + M):
                for x in range(c, c + M):
                    killedFlies += flies[y][x]
            maxFlies = max(killedFlies, maxFlies)

    print(f"#{tc} {maxFlies}")
