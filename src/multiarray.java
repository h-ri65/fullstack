import java.util.Scanner;

public class multiarray {
    public static void main(String[] args) {


        int[][] arr =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int big=0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j =0; j<arr.length ; j++)
            {
                if(big<arr[i][j])
                {
                    big=arr[i][j];
                }




            }

        }
        System.out.println(big);

    }
}

