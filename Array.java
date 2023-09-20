import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // using for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // using foreach
        for (int num : array) {
            System.out.println(num);

        }
        //two D array
        int[][] twoDArr= new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                twoDArr[i][j]=i+j;
            }
        }
      
        System.out.println("this is value from matrix 2D array: "+ twoDArr[2][3]);
        System.out.println(Arrays.toString(twoDArr));
    }
}

