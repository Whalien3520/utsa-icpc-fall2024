from textwrap import wrap

s = input()

print(sorted(wrap(s, len(s)//3))[1])
