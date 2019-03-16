class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        char[] characters = s.toCharArray();
        if(s == null){
            return null;
        }
        String max = "",temp;
        String s1,s2;
        for(int i = 0; i < length; i++){
            s1 = palindromChecker(i,i,characters);
            s2 = palindromChecker(i,i+1,characters);
            if(s1.length() > s2.length()){
                temp = s1;
            }else{
                temp = s2;
            }
            if(max.length() < temp.length()){
                max = temp;
            }    
        }
        return max;
    }
    
    static String palindromChecker(int mid1,int mid2, char[] characters){
        int i,j;
        for(i = mid1,j=mid2; i >=0 && j < characters.length; i--){
            if(characters[i] != characters[j]){
                i++;
                j--;
                break;
            }
            j++;
        }
        if(i == -1){
            i = 0;
            j--;
        }
        if(j >= characters.length){
            j = characters.length - 1;
            i++;
        }
        String s = "";
        for(int temp = i; temp <= j; temp++){
            s += characters[temp];
        }
        return s;
    }
}
