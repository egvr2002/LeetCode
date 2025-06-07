class Solution:
    def shortestPalindrome(self, s: str) -> str:
        t = s[::-1]
        for i in range(len(s)):
            if s.startswith(t[i:]):
                return t[:i] + s
        return t + s
    