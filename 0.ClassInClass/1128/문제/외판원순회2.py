# 백준 10971 외판원 순회 2
# 0에서 출발하는 순환 경로(만!) 모두 탐색

N = int(input())
adj_matrix = [list(map(int, input().split())) for _ in range(N)]

def perm():
    # 마지막 도시에 도착하면(depth == N)
        # 마지막 -> 출발 이동 비용을 더해주고
        # 정답 갱신하고 리턴

  # 갈 수 있는 곳을 탐색하여
      # 방문한 적 없고, 0이 아니라면
          # 방문 체크하고
          # 방문(재귀)
          # 방문 체크 해제

# 다음 시간까지 풀어오기