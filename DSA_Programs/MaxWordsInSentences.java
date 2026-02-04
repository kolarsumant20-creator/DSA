public class MaxWordsInSentences {
    public int mostWordsFound(String[] sentences) {
        int maxWordCount = 0, wordCount = 0;

        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            wordCount = words.length;
            if(maxWordCount < wordCount){
                maxWordCount = wordCount;
            }
        }
        return maxWordCount;
    }
    public static void main(String[] args) {
        //String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        String[] sentences = {"please wait", "continue to fight", "continue to win"};

        MaxWordsInSentences obj = new MaxWordsInSentences();
        System.out.println(obj.mostWordsFound(sentences));
    }
}
