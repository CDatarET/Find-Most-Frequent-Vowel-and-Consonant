class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        int mv = 0;
        int mc = 0;
        for(char c = 'a'; c <= 'z'; c++){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                mv = Math.max(mv, count[c - 'a']);
            }
            else{
                mc = Math.max(mc, count[c - 'a']);
            }
        }

        return mv + mc;
    }
}
