
N, P, S = input().split()
for _ in range(int(S)):
    if P in input().split()[1:]:
        print("KEEP")
    else:
        print("REMOVE")
