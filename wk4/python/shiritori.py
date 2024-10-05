A = [input() for _ in range(int(input()))]
prev = A[0]
seen = set([prev])

for i, word in enumerate(A[1:], start=1):
    if word in seen or word[0] != prev[-1]: 
        exit(print(f"Player {i%2+1} lost"))
    prev = word
    seen.add(word)
print("Fair Game")

