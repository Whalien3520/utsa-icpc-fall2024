from collections import defaultdict

def process_night(villagers, present, night, all_songs):
    if 1 in present:
        for person in present:
            villagers[person].append(night)
        all_songs.append(night)
    else:
        known_songs = set(song for songs in villagers.values() for song in songs)
        for person in present:
            villagers[person] = list(known_songs)

num_villagers = int(input())
num_nights = int(input())
villagers = defaultdict(list)
all_songs = []

for night in range(num_nights):
    data = list(map(int, input().split()))
    present_villagers = data[1:]  
    process_night(villagers, present_villagers, night, all_songs)

good_villagers = sorted([villager for villager, songs in villagers.items() if sorted(songs) == sorted(all_songs)])
print("\n".join(map(str, good_villagers)))