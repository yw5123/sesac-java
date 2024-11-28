# 백준 15654 N과 M(5)

N, M = map(int, input().split())

nums = list(map(int, input().split()))
nums.sort()

visited = [0] * N
ans = []


def perm(depth):
    # 도시 3개를 방문하면 종료 (= 인쇄실)
    if depth == M:
        print(*ans)
        return

    # 다음에 갈 곳을 탐색해서
    for idx in range(N):
        # 방문한 적이 없다면
        if not visited[idx]:
            # 방문 표시하고
            visited[idx] = 1
            # 방문
            ans.append(nums[idx])
            perm(depth + 1)

            # 방문 표시 해제 (중요)
            ans.pop()
            visited[idx] = 0


perm(0)
