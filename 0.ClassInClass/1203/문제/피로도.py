# 프로그래머스 87946 피로도

from itertools import permutations


def solution(k, dungeons):
    answer = -1

    for each_cases in permutations(dungeons):
        cnt = 0
        tmp_k = k
        for dungeon in each_cases:
            if tmp_k >= dungeon[0]:
                tmp_k -= dungeon[1]
                cnt += 1
            else:
                break
        answer = max(answer, cnt)

    return answer
