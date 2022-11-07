import java.util.Scanner;

public class prb1
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int number;
        System.out.println("Enter the number:");
        number = sc.nextInt();
        repSquare(number);
    }
    public static void repSquare(int num)
    {
        int org = num,time = 0,count=1;
        while(num >= (count*count))
        {
            System.out.print(count+"^2 ");
            num -= (count*count); 
            if(num == 0)
            {
                num = org;
                count++;
                time++;
                System.out.println();
            }
            if(org < (count*count))
                count--; 
        }
        System.out.println(time);
    }
}