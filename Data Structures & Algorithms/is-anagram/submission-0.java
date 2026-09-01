class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] Sorted_s = s.toCharArray();
        char[] Sorted_t = t.toCharArray();
        Arrays.sort(Sorted_s);
        Arrays.sort(Sorted_t);
        return Arrays.equals(Sorted_s,Sorted_t);
    }
}
