class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mp = {"}":"{", "]":"[",")":"("}

        for char in s:
            if char in "[({":
                stack.append(char)
                continue

            if not stack: return False

            if mp[char] == stack[-1]:
                stack.pop()
                continue
            
            return False

        return not stack


                
