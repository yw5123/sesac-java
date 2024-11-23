# 백준 2606 바이러스

# 인접 행렬, 인접 리스트로 각각 구조화해보기
# 힌트: 0번을 만들고 사용하지 않으면 됨

# # 인접 행렬로 만들기
# V = int(input())
# E = int(input())

# adj_matrix = [[0] * (V + 1) for _ in range(V + 1)]

# for _ in range(E):
#     s, e = map(int, input().split())
#     adj_matrix[s][e] = 1
#     adj_matrix[e][s] = 1

from collections import deque

# 인접 리스트로 만들기
V = int(input())
E = int(input())

adj_lst = [[] for _ in range(V + 1)]

for _ in range(E):
    s, e = map(int, input().split())
    adj_lst[s].append(e)
    adj_lst[e].append(s)

# 1
queue = deque([1])
visited = set([1])

while queue:
    cur = queue.popleft()

    for nxt in adj_lst[cur]:
        if nxt not in visited:
            visited.add(nxt)
            queue.append(nxt)

ans = len(visited) - 1

# 2
queue = deque([1])
visited = [0] * (V + 1)

while queue:
    cur = queue.popleft()

    for nxt in adj_lst[cur]:
        if not visited[nxt]:
            visited[nxt] = 1
            queue.append(nxt)

ans = sum(visited) - 1
print(ans)
