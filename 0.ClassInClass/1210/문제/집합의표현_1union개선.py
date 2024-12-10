# 백준 1717 집합의 표현

import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9)


def find(x):
    while x != parent[x]:
        x = parent[x]
    return x


def union(x, y):
    if find(x) != find(y):
        if rank[find(x)] > rank[find(y)]:
            parent[find[y]] = find(x)
        elif rank[find(x)] < rank[find(y)]:
            parent[find(x)] = find(y)
        else:
            parent[find(x)] = find(y)
            rank[find(y)] += 1


n, m = map(int, input().split())
parent = list(range(n + 1))

for _ in range(m):
    c, a, b = map(int, input().split())
    rank = [0] * (n + 1)

    if c == 0:
        union(a, b)

    elif c == 1:
        if find(a) == find(b):
            print("YES")
        else:
            print("NO")
