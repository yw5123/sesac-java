# 백준 1991 트리 순회

N = int(input())

tree = {}

for _ in range(N):
    parent, L, R = input().split()
    tree[parent] = [L, R]

pre_trail = []
in_trail = []
post_trail = []


def preorder(cur):
    # 방문
    pre_trail.append(cur)
    # 왼쪽 서브트리 탐색
    if tree[cur][0] != ".":
        preorder(tree[cur][0])
    # 오른쪽 서브트리 탐색
    if tree[cur][1] != ".":
        preorder(tree[cur][1])


def inorder(cur):
    # 왼쪽 서브트리 탐색
    if tree[cur][0] != ".":
        inorder(tree[cur][0])
    # 방문
    in_trail.append(cur)
    # 오른쪽 서브트리 탐색
    if tree[cur][1] != ".":
        inorder(tree[cur][1])


def postorder(cur):
    # 왼쪽 탐색
    if tree[cur][0] != ".":
        postorder(tree[cur][0])
    # 오른쪽 탐색
    if tree[cur][1] != ".":
        postorder(tree[cur][1])
    # 방문
    post_trail.append(cur)


preorder("A")
print("".join(pre_trail))

inorder("A")
print("".join(in_trail))

postorder("A")
print("".join(post_trail))
