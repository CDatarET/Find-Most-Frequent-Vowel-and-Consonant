class Solution:
    def maxFreqSum(self, s: str) -> int:
        c = Counter(s)
        mv = 0
        mc = 0
        for x in c:
            if x in ['a', 'e', 'i', 'o', 'u']:
                mv = max(mv, c[x])
            else:
                mc = max(mc, c[x])
        
        return mv + mc
