public class CharCounts {

    public static void NoOfCharactersCounts(String str){
        int[] count = new int[256];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch==' '){
                continue;
            }
            
            count[ch]++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                System.out.println((char)i+" = " + count[i]);
            }
        }

    }
    public static void main(String[] args) {
        String str = "Automations";
        NoOfCharactersCounts(str);
        
    }
    
}
