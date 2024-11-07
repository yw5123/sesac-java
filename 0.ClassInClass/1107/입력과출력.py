# SW 4828_min max

T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    nums = list(map(int, input().split()))

    # 초기값을 2개 설정
    max_num = -float("INF")
    min_num = float("INF")

    # 반복문을 이용해서 nums를 순회하며
    for num in nums:
        # max_num과 방금 뽑은 숫자를 비교 => 갱신
        if num > max_num:
            max_num = num
        # min_num과 방금 뽑은 숫자를 비교 => 갱신
        if num < min_num:
            min_num = num

    ans = max_num - min_num

    print(f"#{tc} {ans}")
