import sys

input = sys.stdin.readline

N, K = map(int, input().split())

temperatures = list(map(int, input().split()))

max_sum = tmp = sum(temperatures[:K])

for idx in range(N - K):
    tmp += temperatures[idx + K] - temperatures[idx]
    max_sum = max(max_sum, tmp)

print(max_sum)
