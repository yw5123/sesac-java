# 백준 1697 숨바꼭질

from collections import deque

N, K = map(int, input().split())

# 세팅(출발지, 예정지, 기록지)
queue = deque([(N, 0)])
visited = set([N])

# DFS/BFS
while queue:
    # 방문
    cur, cnt = queue.popleft()

    # K에 도착했는지 확인
    if cur == K:
        break

    # 탐색
    for nxt in [cur + 1, cur - 1, cur * 2]:
        if 0 <= nxt <= 144_444 and nxt not in visited:
            visited.add((nxt, cnt + 1))
            queue.append((nxt, cnt + 1))

print(cnt)
