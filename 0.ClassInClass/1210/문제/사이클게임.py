# 백준 20040 사이클 게임
# Union-Find 알고리즘

import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9)


def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


def union(x, y):
    if find(x) != find(y):
        parent[find(x)] = find(y)


n, m = map(int, input().split())
parent = list(range(n))

for cnt in range(1, m + 1):
    a, b = map(int, input().split())

    if find(a) == find(b):
        break

    union(a, b)

else:
    print(0)
