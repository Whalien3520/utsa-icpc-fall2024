seen = set()
for _ in range(int(input())):
    seen.add(input().lower().replace("-", " "))
print(len(seen))
