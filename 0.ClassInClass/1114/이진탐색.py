T = int(input())


def binary_search(l, r, target, depth):
    # 가운데를 찝는다
    c = int((l + r) / 2)

    # c가 타겟과 일치한다면?
    if c == target:
        # return 탐색횟수
        return depth

    # c가 타겟보다 크다면?
    elif c > target:
        # 왼쪽 절반으로 재귀 (r을 c로 갱신)
        return binary_search(l, c, target, depth + 1)

    # c가 타겟보다 작다면?
    elif c < target:
        # 오른쪽 절반으로 재귀 (l을 c로 갱신)
        return binary_search(c, r, target, depth + 1)


# while을 사용해서도 구현 가능
def binary_search_2(l, r, target, cnt):
    while True:
        c = int((l + r) / 2)

        if c == target:
            return cnt

        elif c > target:
            r = c

        elif c < target:
            l = c

        cnt += 1


for tc in range(1, T + 1):
    p, a, b = map(int, input().split())

    num_a = binary_search_2(1, p, a, 1)
    num_b = binary_search_2(1, p, b, 1)
    winner = 0

    if num_a < num_b:
        winner = "A"
    elif num_a > num_b:
        winner = "B"

    print(f"#{tc} {winner}")
