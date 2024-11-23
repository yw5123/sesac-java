V = int(input())
E = int(input())

# 1. 빈 판 만들기
adj_lst = [[] for _ in range(V + 1)]

# 2. 간선 정보 입력받기
for _ in range(E):
    a, b = map(int, input().split())
    adj_lst[a].append(b)
    adj_lst[b].append(a)


##############################
# 세팅(출발지, 기록지) - 재귀함수를 사용하면 예정지 없어도 됨
# 재귀 함수의 동작이 스택과 비슷함
visited = [0] * (V + 1)
visited[1] = 1


def DFS(cur):
    # 방문 = 함수에 입장하는 것 자체가 방문

    # 탐색
    # cur에서 갈 수 있는 곳 중에서
    for nxt in adj_lst[cur]:
        # 방문한 적이 없다면?
        if not visited[nxt]:
            # 방문 체크하고
            visited[nxt] = 1
            # 바로 방문
            DFS(nxt)


DFS(1)
