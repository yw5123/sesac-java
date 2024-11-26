# 백준 3184 양

import sys

input = sys.stdin.readline

# 델타 세팅
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


# DFS
def DFS(r, c):
    # 출발지, 예정지, 임시양, 임시늑대
    stack = [(r, c)]
    tmp_o, tmp_v = 0, 0

    visited.add((r, c))
    if field[r][c] == "o":
        tmp_o += 1
    elif field[r][c] == "v":
        tmp_v += 1

    # 예정지가 빌 때까지 아래 로직 반복
    while stack:
        # 방문
        r, c = stack.pop()

        # 탐색 - 델타 탐색
        # 4방향을 탐색하며
        for d in range(4):
            # 새로운 좌표를 찍어보고
            nr, nc = r + dr[d], c + dc[d]
            # 갈 수 있다면(범위, 울타리x, 방문x)
            if (
                0 <= nr < R
                and 0 <= nc < C
                and field[nr][nc] != "#"
                and (nr, nc) not in visited
            ):
                # 양인지, 늑대인지 검토
                if field[nr][nc] == "o":
                    tmp_o += 1
                elif field[nr][nc] == "v":
                    tmp_v += 1
                # 방문 체크하고
                visited.add((nr, nc))
                # 예정지에 담기
                stack.append((nr, nc))

        # 임시양, 임시늑대 비교해서 리턴
        if tmp_o > tmp_v:
            return tmp_o, 0
        else:
            return 0, tmp_v


R, C = map(int, input().split())

field = [list(input().rstrip()) for _ in range(R)]

# 초기 세팅(출발지, 기록지, 예정지)
visited = set()
o_cnt, v_cnt = 0, 0

# field를 순회하며,
for r in range(R):
    for c in range(C):
        # 울타리도 아니고, 방문한 적도 없다면?
        if field[r][c] != "#" and (r, c) not in visited:
            # 방문하고 DFS(BFS도 가능)
            tmp_o, tmp_v = DFS(r, c)
            # 결과를 전체 양, 늑대 개수에 반영
            o_cnt += tmp_o
            v_cnt += tmp_v

print(o_cnt, v_cnt)
