def allsubs(x):         return [x[i:j] for i in range(len(x)) for j in range(i+1,len(x)+1)]

s = "".join([x.lower() for x in input() if x.isalpha()])
if [x for x in allsubs(s) if len(x) > 1 and x==x[::-1]]:
    print("Palindrome")
else:
    print("Anti-palindrome")

