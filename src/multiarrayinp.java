import java.util.Scanner;

public class multiarrayinp
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and coloums");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr1[][]= new int[r][c];
        int arr2[][]= new int[r][c];
        int arrs[][]= new int[r][c];
        System.out.println("enter the elements of first mat");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of second mat");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt( );
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arrs[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("enter the elements of first mat");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arrs[i][j]+"\t");
            }
            System.out.println("\n");
        }


    }
}
