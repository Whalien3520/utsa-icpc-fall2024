n, k = map(int, input().split())
commands = input().split()
stack = []
for command in commands:
    if command == "undo":
        stack.append("undo")
        continue

    if not stack or stack[-1] != "undo":
        stack.append(int(command))
    else:
        for i in range(int(command)+1):
            stack.pop()

print(sum(stack)%n)
