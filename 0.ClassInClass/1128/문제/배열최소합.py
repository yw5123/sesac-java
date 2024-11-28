# SWEA 4881 배열 최소 합

T = int(input())


def perm(depth, cnt):
    global ans
    # 마지막 뎁스에 도달했다면?
    if depth == N:
        # 정답을 갱신하고 리턴
        ans = min(ans, cnt)
        return

    # 백트래킹
    if cnt > ans:
        return

    # 다음에 갈 곳을 탐색하며,
    for idx in range(N):
        # 방문한 적 없다면?
        if not visited[idx]:
            # 방문 체크하고
            visited[idx] = 1
            # 방문(재귀)
            perm(depth + 1, cnt + matrix[depth][idx])
            # 방문 체크 해제(중요)
            visited[idx] = 0


for tc in range(1, T + 1):
    N = int(input())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    ans = float("INF")
    visited = [0] * N

    perm(0, 0)

    print(f"#{tc} {ans}")
