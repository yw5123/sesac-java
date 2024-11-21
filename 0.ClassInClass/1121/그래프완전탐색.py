from collections import deque

V = int(input())
E = int(input())

adj_lst = []

# BFS(너비 우선 탐색)
# 초기 세팅(출발지, 기록지, 예정지)
queue = deque([1])  # 예정지
visited = set([1])  # 기록지

# 예정지가 빌 때까지
while queue:
    # 예정지에서 꺼내서 방문
    cur = queue.popleft()

    # 방문한 곳에서 갈 수 있는 곳 탐색(인접리스트)
    for nxt in adj_lst[cur]:
        # 방문한 적이 없는 곳이라면? (기록지)
        if nxt not in visited:
            # 방문 체크하고
            visited.add(nxt)
            # 예정지에 집어넣는다
            queue.append(nxt)


# queue => stack 으로 바꾸기만 하면 DFS(깊이 우선 탐색)


# 방문 체크하는 다른 방법
queue = deque([1])
visited = [0] * (V + 1)

while queue:
    cur = queue.popleft()

    for nxt in adj_lst[cur]:
        if not visited[nxt]:
            visited[nxt] = 1
            queue.append(nxt)
