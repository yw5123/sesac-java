# 프로그래머스 86971 전력망을 둘로 나누기
from collections import deque


def solution(n, wires):
    in_degree = [0] * (n + 1)

    # 구조화
    adj_matrix = [[0] * (n + 1) for _ in range(n + 1)]
    for a, b in wires:
        adj_matrix[a][b] = 1
        adj_matrix[b][a] = 1
        in_degree[a] += 1
        in_degree[b] += 1

    queue = deque()
    # 리프노드를 큐에 넣기
    for idx in range(1, n + 1):
        if in_degree[idx] == 1:
            queue.append(idx)

    answer = float("INF")
    rank = [1] * (n + 1)

    # 큐가 빌 때까지
    while queue:
        # 뽑아서
        cur = queue.popleft()
        answer = min(answer, abs(2 * rank[cur] - n))

        # 탐색
        # 갈 수 있는 정점을 탐색해서
        for nxt in range(1, n + 1):
            if adj_matrix[cur][nxt]:
                # nxt 진입차수 1 깎고
                in_degree[nxt] -= 1
                # rank[nxt] += rank[cur]
                rank[nxt] += rank[cur]
                # 만약 nxt의 진입차수가 1이 되었다면?
                if in_degree[nxt] == 1:
                    # 큐에 넣기
                    queue.append(nxt)

    return answer


print(solution(9, [[1, 3], [2, 3], [3, 4], [4, 5], [4, 6], [4, 7], [7, 8], [7, 9]]))
print(solution(4, [[1, 2], [2, 3], [3, 4]]))
print(solution(7, [[1, 2], [2, 7], [3, 7], [3, 4], [4, 5], [6, 7]]))
