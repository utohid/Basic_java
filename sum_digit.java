import java.util.Scanner;

public class palindrom_num {
    public static void main(String args[])
    {
        int num;int sum=0;
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        int rev=num;

        int i=0;
        while(num!=0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        if (rev==sum)
        {
            System.out.println("This is a plaindrum");
        }
        else
            System.out.println("Not a palindrum");
    }
}
