public class FirstPalindromicStringInArray {
    public String firstPalindrome(String[] words){
        for(String word : words){

            String original = word;
            String reversed = "";
            for(int i = word.length()-1; i >= 0; i--){
                reversed = reversed + word.charAt(i);
            }
            if(reversed.equals(original)){
                    return word;
                }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","racecar","ada","cool"};

        FirstPalindromicStringInArray obj = new FirstPalindromicStringInArray();
        System.out.println(obj.firstPalindrome(words));
    }
}
