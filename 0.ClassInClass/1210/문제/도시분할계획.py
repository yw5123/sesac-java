# 백준 1647 도시 분할 계획
# 최소 신장 트리

import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9)


def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


def union(x, y):
    parent[find(x)] = find(y)


N, M = map(int, input().split())
edges = [list(map(int, input().split())) for _ in range(M)]
edges.sort(key=lambda x: x[2])

parent = [i for i in range(N + 1)]
cnt = ans = 0

# 간선을 하나씩 꺼내서
for a, b, w in edges:
    # 연결할 수 없다면?(사이클이 생긴다면?)
    if find(a) == find(b):
        # 그냥 넘어간다
        continue

    # 연결할 수 있다면?(사이클이 생기지 않는다면?)
    # 연결하고
    union(a, b)
    # 간선 하나 세어주기
    cnt += 1
    # 가중치를 더해준다
    ans += w

    # 간선을 하나 덜 뽑으면 분할된 상태
    # if cnt == N - 2:  # (!!!) N이 2인 경우 오류 발생
    #     break

    # 간선을 몇개 뽑았는지 검토 (=> N이 2인 경우를 고려)
    if cnt == N - 1:
        # N-1개 뽑았다면? => 마지막 가중치를 빼고 종료
        ans -= w
        break

print(ans)
