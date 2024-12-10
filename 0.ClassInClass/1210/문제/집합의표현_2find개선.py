# 백준 1717 집합의 표현

import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9)


def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])

    return parent[x]


# find를 재귀로 개선하면 union에서 rank(트리의 깊이) 고려하지 않아도 됨
def union(x, y):
    if find(x) != find(y):
        parent[find(x)] = find(y)


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
