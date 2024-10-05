from itertools import pairwise

while True:
    try:
        A = list(map(int, input().split()))[1:]
        diffs = [abs(a-b) for a,b in pairwise(A)]
        if sorted(diffs) == list(range(1, len(diffs)+1)):
            print("Jolly")
        else:
            print("Not jolly")
    except EOFError: break
