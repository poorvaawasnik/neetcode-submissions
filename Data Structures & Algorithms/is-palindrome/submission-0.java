class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder Str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                Str.append(Character.toLowerCase(c));
            }
        }
        return 
        Str.toString().equals(Str.reverse().toString());
    }
}
