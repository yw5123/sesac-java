# SWEA 5174 subtree

T = int(input())

for tc in range(1, T + 1):
    E, N = map(int, input().split())
    edges = list(map(int, input().split()))

    L = [0] * (E + 2)
    R = [0] * (E + 2)

    # 구조화
    for idx in range(E):
        u, v = edges[idx * 2], edges[idx * 2 + 1]
        if not L[u]:
            L[u] = v
        else:
            R[u] = v

    # 구조화 방법 2
    # for idx in range(0, 2 * E, 2):
    #     u, v = edges[idx], edges[idx + 1]

    cnt = 0

    # DFS(N)
    def DFS(cur):
        global cnt
        # 방문
        # 카운팅 + 1
        cnt += 1

        # 탐색
        # 갈 수 있는 곳(자식 노드) 찾아서
        # 왼쪽 자식 노드가 있다면
        if L[cur]:
            # 방문
            DFS(L[cur])

        # 오른쪽 자식 노드가 있다면
        if R[cur]:
            # 방문
            DFS(R[cur])

    DFS(N)
    print(f"#{tc} {cnt}")
