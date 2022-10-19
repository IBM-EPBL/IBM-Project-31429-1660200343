import java.util.Scanner;

public class prb2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int number,i=0,pali=0,sum,digit=0;
        System.out.println("Enter the number:");
        number = sc.nextInt();
        digit = getNoDigit(number);
        for(i=0;i<5;i++)
        {
            if(checkPali(number, digit)==1)
            {
                System.out.println(number+" is a plaindrom number");
                break;
            }
            pali = doPali(number,digit);
            sum = pali+number;
            if(checkPali(sum,digit) == 1)
                {
                    System.out.println("Palindrom at "+(i+1)+" time "+ sum + " -number");
                    break;
                }
            number = sum;
        }
        if(i == 4)
            System.out.println("No result");
    }
    public static int getNoDigit(int num)
    {
        int i=0;
        while(num!=0)
        {
            num = num/10;
            i++;
        }
        return i;
    }
    public static int checkPali(int num,int digit)
    {
        int ans=0,di=0,org = num;
        while(num!=0)
        {
            di=num%10;
            ans=(ans*10)+di;
            num/=10;
        }
        if(ans == org)
            return 1;
        return 0;
    }
    public static int doPali(int num,int digit)
    {
        int ans=0,di=0;
        while(num != 0)
        {
            di = num%10;
            ans = (ans*10)+di;
            num/= 10;
        }
        return ans;
    }

}