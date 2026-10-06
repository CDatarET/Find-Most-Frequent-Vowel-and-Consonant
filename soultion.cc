class Solution {
public:
    int maxFreqSum(string s) {
        int count[26] = {0};
        for(int i = 0; i < s.length(); i++){
            count[s[i] - 'a']++;
        }

        int mv = 0;
        int mc = 0;
        for(char c = 'a'; c <= 'z'; c++){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                mv = max(mv, count[c - 'a']);
            }
            else{
                mc = max(mc, count[c - 'a']);
            }
        }

        return mv + mc;
    }
};
