for _ in range(int(input())):
    N = int(input())
    s = input()
    stack = []
    ans = 0
    for i, c in enumerate(s):
        if c == "(":
            stack.append(("(", i))
        elif c == ")":
            ans += i - (stack.pop()[1])
        else:
            if stack:
                ans += i-(stack.pop()[1])
            else:
                stack.append(("(", i))
    print(ans)
