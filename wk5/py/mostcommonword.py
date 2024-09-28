# link: https://leetcode.com/problems/most-common-word/
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        banned = set(banned)
        paragraph = "".join([x.lower() if x.isalpha() else " " for x in paragraph]).split()
        fq = Counter(filter(lambda x: x not in banned, paragraph))
        return fq.most_common(1)[0][0]