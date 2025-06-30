import java.util.Scanner;

public class transpose
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and coloums for mat 1");
        int r= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("enter the number of rows and coloums for mat2");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int arr1[][]= new int[r][c];
        int arr2[][]= new int[r2][c2];
        int arrp[][]= new int[r][c2];
        System.out.println("enter the elements of first mat");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the elements of second mat");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c2;j++)

            {
                for(int k=0;k<c;k++)

                {

                    arrp[i][j] += (arr1[i][k] * arr2[k][j]) ;
                }

            }

        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c2; j++) {

                System.out.print(arrp[i][j]+" ");

            }
            System.out.println();
        }



    }
}
