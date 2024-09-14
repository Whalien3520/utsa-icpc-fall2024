word = input()

bs = word.count("b")
ks = word.count("k")

if not ks and not bs:
    print("none")
elif bs > ks:
    print("boba")
elif ks > bs:
    print("kiki")
else:
    print("boki")
