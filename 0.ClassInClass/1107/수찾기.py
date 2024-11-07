# 백준 1920: 수 찾기

# 입력받기

# 아래에 있는 배열을 선형으로 탐색하면서
# 위에 있는 배열에 있다면? 1 출력
# 없다면? 0 출력

# 맨 위에 붙여넣고 풀기 - 백준에서만!
import sys

input = sys.stdin.readline

N = int(input())
numN = set(map(int, input().split()))

M = int(input())
numM = list(map(int, input().split()))

for num in numM:
    if num in numN:
        print(1)
    else:
        print(0)
