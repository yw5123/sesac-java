# 프로그래머스 86971 전력망을 둘로 나누기


def solution(n, wires):
    def DFS(start):
        # 초기 세팅
        stack = [start]
        visited = set([start])

        # 예정지가 빌 때까지
        while stack:
            # 방문
            cur = stack.pop()

            # 탐색
            # 갈 수 있는 곳을 찍어서
            for nxt in range(1, n + 1):
                # 갈 수 있다면(방문한 적이 없다면?)
                if adj_matrix[cur][nxt] and nxt not in visited:
                    # 방문체크하고
                    visited.add(nxt)
                    # 예정지에 넣기
                    stack.append(nxt)
        return abs(2 * len(visited) - n)

    # 구조화
    adj_matrix = [[0] * (n + 1) for _ in range(n + 1)]
    for a, b in wires:
        adj_matrix[a][b] = 1
        adj_matrix[b][a] = 1

    answer = float("INF")

    # 모든 간선에 대하여
    for a, b in wires:
        # 간선 하나를 잘라보고
        adj_matrix[a][b] = adj_matrix[b][a] = 0
        # DFS/BFS 돌린 후에 정답을 갱신
        answer = min(answer, DFS(1))
        # 간선 다시 붙이기
        adj_matrix[a][b] = adj_matrix[b][a] = 1

    return answer


print(solution(9, [[1, 3], [2, 3], [3, 4], [4, 5], [4, 6], [4, 7], [7, 8], [7, 9]]))
print(solution(4, [[1, 2], [2, 3], [3, 4]]))
print(solution(7, [[1, 2], [2, 7], [3, 7], [3, 4], [4, 5], [6, 7]]))
