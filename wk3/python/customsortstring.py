# https://leetcode.com/problems/custom-sort-string/
class Solution:
    def customSortString(self, order: str, s: str) -> str:
        isIn, isOut = [], []

        for c in s: (isOut, isIn)[c in order].append(c)

        isIn.sort(key=lambda x: order.index(x))
        return "".join(isIn + isOut)

