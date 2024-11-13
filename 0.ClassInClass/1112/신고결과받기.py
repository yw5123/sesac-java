# 신고 결과 받기


# 테스트는 통과하는데 제출 실패
def solution1(id_list, report, k):
    answer = []
    reported_dic = {}

    for id in id_list:
        reported_dic[id] = [0, []]

    for case in report:
        a, b = case.split()
        if b not in reported_dic[a][1]:
            reported_dic[a][1].append(b)
            reported_dic[b][0] += 1

    banned_list = [id for id in id_list if reported_dic[id][0] >= 2]

    for id in id_list:
        mail_num = 0
        for case in reported_dic[id][1]:
            if case in banned_list:
                mail_num += 1
        answer.append(mail_num)

    return answer


# 테스트는 통과하는데 제출 실패
def solution2(id_list, report, k):
    answer = []
    reported_dic = {}

    for id in id_list:
        reported_dic[id] = [0, 0, []]

    for case in report:
        a, b = case.split()
        if a not in reported_dic[b][2]:
            reported_dic[b][2].append(a)
            reported_dic[b][1] += 1

    banned_list = [id for id in id_list if reported_dic[id][1] >= 2]

    for id in banned_list:
        for case in reported_dic[id][2]:
            reported_dic[case][0] += 1

    answer = [reported_dic[id][0] for id in id_list]

    return answer
