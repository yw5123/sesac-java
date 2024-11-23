# 백준 2805 나무자르기

import sys

input = sys.stdin.readline

N, M = map(int, input().split())
trees = list(map(int, input().split()))

# 초기값 세팅(l, r, c)
l, r = 0, 1_000_000_000
c = (1 + r) // 2

# 반복을 하며 (l < r)
while l <= r:
    # c를 가지고 가져갈 수 있는 나무 길이를 계산
    length = 0
    for tree in trees:
        if tree > c:
            length += tree - c

    # length == M
    if length == M:
        # 정답 (break)
        break

    # length > M
    elif length > M:
        # l 값을 갱신
        l = c + 1

    # length < M
    elif length < M:
        # r 값을 갱신
        r = c - 1

    # 새로운 c를 계산
    c = (l + r) // 2

print(c)
