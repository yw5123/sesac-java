# 숙제: 문제 하나 풀어보기 (입력된 값 변환은 작성해주심)
# 백준 2711: 오타맨 고창영

T = int(input())

for _ in range(T):
    idx, word = input().split()
    idx = int(idx)
    print(word[: idx - 1] + word[idx:])
