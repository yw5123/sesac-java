from heapq import heappop, heappush, heapify

nums = [1, 2, 3, 1, 2, 3, 145, 2, 6]
heapify(nums)
print(nums)

# 최소힙을 최대힙으로 만들기

heap = []
heappush(heap, -5)
heappush(heap, -10)
heappush(heap, -1)

print(heap)

print(-heappop(heap))
print(-heappop(heap))
print(-heappop(heap))
