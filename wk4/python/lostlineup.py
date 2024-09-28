N = int(input())
A = list(map(int, input().split()))

new = [(A[i],i) for i in range(len(A))]
new.sort()
print("1 "+ " ".join(map(str, [x[1]+2 for x in new])))
