# 재귀 함수를 이용해서 nums에서 가장 큰 수 탐색
nums = [-5, 2, 7, -3, 2, 10, 8, 6, 5, -1]

ans = -float("INF")


def my_func(idx):
    global ans

    # 재귀의 종료 조건
    if idx >= len(nums):
        return

    # 탐색 로직
    ans = max(nums[idx], ans)

    my_func(idx + 1)


my_func(0)
print(ans)


def my_func(idx, ans):
    if idx >= len(nums):
        return ans

    ans = max(nums[idx], ans)

    return my_func(idx + 1, ans)


print(my_func(0, -float("INF")))


# 재귀 함수 진행 이해를 위한 예시코드
def find(depth):
    if depth == 10:
        print("찾았다!")
        return

    print(f"탐색하는 중.. 깊이는 {depth}")

    find(depth + 1)

    print(f"올라가는 중.. 깊이는 {depth}")


find(0)
