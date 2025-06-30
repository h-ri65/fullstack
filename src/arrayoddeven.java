import java.util.Scanner;


public class arrayoddeven {
    public static void main(String[] args) {
        int e=0;
        int o=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elemts in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e++;
            }
            else
            {
                 o++;
            }
        }
        System.out.println("no of even is "+e+"\n number of odd number="+o);

    }
}

