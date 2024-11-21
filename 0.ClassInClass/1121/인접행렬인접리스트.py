# 7
# 7
# 0 1
# 1 2
# 0 4
# 4 1
# 4 5
# 3 6
# 6 5

##############################

# 인접 행렬로 만들기
V = int(input())
E = int(input())

# 1. 빈 판 만들기(V*V)
adj_matrix = [[0] * V for _ in range(V)]

# 2. 간선 정보 입력받기
for _ in range(E):
    s, e = map(int, input().split())
    adj_matrix[s][e] = 1

    # # 이렇게 하면 양방향
    # adj_matrix[s][e] = 1
    # adj_matrix[e][s] = 1

    # # 가중치가 있으면 한줄에 입력이 3개 됨
    # s, e, w = map(int, input().split())
    # adj_matrix[s][e] = w
    # adj_matrix[e][s] = w


##############################

# 인접 리스트로 만들기
V = int(input())
E = int(input())

# 1. 빈 판 만들기(빈 리스트가 V개 들어있는 2차원 리스트)
adj_lst = [[] for _ in range(V)]

# 2. 간선 정보 입력받기
for _ in range(E):
    s, e = map(int, input().split())
    adj_lst[s].append(e)
