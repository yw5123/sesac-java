from heapq import heappop, heappush, heapify

N = int(input())

# 힙 자료구조로 구조화
heap = []
for _ in range(N):
    card = int(input())
    heappush(heap, card)

ans = 0

# 카드 뭉치가 하나 남을 때까지 반복
while len(heap) > 1:
    # 가장 작은 카드 두 뭉치를 뽑아서
    card1, card2 = heappop(heap), heappop(heap)
    # 더한 후에
    n_card = card1 + card2
    # 더한 값(비교횟수)을 누적
    ans += n_card
    # 다시 카드뭉치 덩어리(힙)에 넣기
    heappush(heap, n_card)

# 누적값 출력
print(ans)
