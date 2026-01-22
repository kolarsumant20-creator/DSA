public class ESwapToHashIncrement {
    public static void main(String[] args) {

        String str = "my name is Alexander";
        StringBuilder result = new StringBuilder();

        int eCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'e') {
                eCount++;
                result.append("#".repeat(eCount));
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}