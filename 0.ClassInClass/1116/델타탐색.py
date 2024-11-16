# 델타 탐색

#     상 하 좌 우
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

matrix = [[3, 7, 9], [4, 2, 6], [8, 1, 5]]

r, c = 1, 1

for i in range(4):
    nr, nc = r + dr[i], c + dc[i]

    if 0 <= nr < 3 and 0 <= nc < 3:
        print(matrix[nr][nc])
