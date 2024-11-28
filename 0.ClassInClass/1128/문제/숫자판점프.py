# 백준 2210 숫자판 점프

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

matrix = [list(input().split()) for _ in range(5)]

ans = set()


def perm(depth, r, c, num):
    if depth == 5:
        # 집합에 집어넣고 리턴
        ans.add(num)
        return

    # 다음에 갈 곳을 탐색해서(델타 탐색)
    for d in range(4):
        # 다음 좌표 찍어보고
        nr, nc = r + dr[d], c + dc[d]
        # 유효성 검사 후에(범위)
        if 0 <= nr < 5 and 0 <= nc < 5:
            # 재귀
            perm(depth + 1, nr, nc, num + matrix[nr][nc])


# 순회하며
for r in range(5):
    for c in range(5):
        # 모든 칸에서 DFS/perm
        perm(0, r, c, matrix[r][c])

print(len(ans))
