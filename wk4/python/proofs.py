concs = set()
for i in range(1,int(input())+1):
    data = input().split()
    if data[0] == "->":
        concs.add(data[1])
        continue

    assumps = data[:-2]
    if [assump for assump in assumps if assump not in concs]:
        exit(print(i))
    concs.add(data[-1])

print("correct")

