package kunalwstDSA.assignment3;

import java.util.Scanner;
public class AverageOfNnumbers {
    public static void main(String[] args) {
        // Calculate Average Of N Numbers

        int n;
        double res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers to cal  avg");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter   "+n+"  numbers");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            res =res+a[i];
        System.out.println("average="+res/n);

    }
}
