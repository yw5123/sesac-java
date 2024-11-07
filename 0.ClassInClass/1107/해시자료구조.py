# 딕셔너리

my_dict = {"name": "ken", "age": 20, "license": True}

# get 메서드
print(my_dict["name"])
print(my_dict.get("name"))

# 없는 key 값으로 접근해도 오류 발생 x (None 반환)
# key 값이 없을 때의 값을 지정할 수도 있음
print(my_dict.get("address"))
print(my_dict.get("address", 0))

# keys, values, items
print(my_dict.keys())  # key 값만 가져와서 전달
print(my_dict.values())  # value 값만 가져와서 전달
print(my_dict.items())  # key, value 값을 튜플로 묶여서 전달

##################################################
# 집합

my_set = set()

# 원소 삽입
my_set.add(5)
print(my_set)

# 원소 삭제
my_set.discard(5)
print(my_set)

my_set.remove(3)  # 없는 key를 삭제하려고 하면 KeyError 발생
my_set.discard(3)  # 없는 key를 삭제하려고 해도 에러가 발생하지 않음
# => discard() 사용 권장
