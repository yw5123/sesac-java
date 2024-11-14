n = int(input())

# fibo(n) = fibo(n - 1) + fibo(n - 2) (단, n >= 2)


# def fibo(n):
#     if n == 0 or n == 1:
#         return n

#     return fibo(n - 1) + fibo(n - 2)


# print(fibo(n))


# 하지만 n이 1 증가할수록 연산이 약 2배씩 증가
# 메모이제이션을 사용하면 시간복잡도 개선 가능
memo = [0, 1]

for _ in range(n - 1):
    memo.append(memo[-1] + memo[-2])

print(memo[n])
