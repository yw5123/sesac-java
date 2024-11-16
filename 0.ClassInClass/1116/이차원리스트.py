# 2차원 리스트
matrix = [[0, 0, 0], [1, 1, 0], [2, 1, 0]]

# 인덱싱
print(matrix[0][0])
print(matrix[0][2])

# 순회 (행 우선)
for r in range(3):
    for c in range(3):
        print(matrix[r][c])

# 순회 (열 우선)
for c in range(3):
    for r in range(3):
        print(matrix[r][c])

# 전치 (2차원 리스트의 행과 열 뒤집기)
for c in range(3):
    for c in range(3):
        if c > r:
            matrix[r][c], matrix[c][r] = matrix[c][r], matrix[r][c]

# zip 함수를 이용한 전치
# zip을 하면 원소가 튜플이 되기 때문에 형변환
transposed_matrix = list(map(list, zip(*matrix)))
