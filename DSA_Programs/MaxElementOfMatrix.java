public class MaxElementOfMatrix {
    
    static int M = 4;
    static int N = 4;

    static int findMax(int mat[][]){
        int maxElement = Integer.MIN_VALUE; // Can be -1
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(mat[i][j] > maxElement){
                    maxElement = mat[i][j];
                }
            }
        }


        return maxElement;
    }
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                          { 25, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                          { 13, 14, 15, 16 } };

        System.out.println(findMax(mat));
    }

}