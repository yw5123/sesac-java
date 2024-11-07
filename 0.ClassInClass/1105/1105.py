# 숙제: 문제 하나 풀어보기 (입력된 값 변환은 작성해주심)
# 백준 2711: 오타맨 고창영

T = int(input())

for _ in range(T):
    idx, word = input().split()
    idx = int(idx)
    print(word[: idx - 1] + word[idx:])

##################################################
# 강사님 풀이 (1107)

T = int(input())

for _ in range(T):
    idx, word = input().split()
    idx = int(idx) - 1

    # 1. 처음 ~ idx 전까지 자르고, idx+1 ~ 끝까지 잘라서 붙이기
    ans = word[:idx] + word[idx + 1 :]

    # 2. 가변 객체인 리스트로 만들어서 수정하고 다시 불변 객체인 문자열로 변환하는 방법으로 푼 사람도 있음
    word = list(word)
    word.pop(idx)
    ans = "".join(word)

    print(ans)
