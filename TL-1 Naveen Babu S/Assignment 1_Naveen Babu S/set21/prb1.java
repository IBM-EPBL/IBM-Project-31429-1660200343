import java.util.Scanner;

public class prb1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int count=2,number=0,flag=0;
        System.out.println("Enter the number:");
        number = sc.nextInt();
        while(count <= (number-count))
        {
            // System.out.println(number-count);
            if(isPrime(number-count) == 1)
            {
                flag=1;
                System.out.printf("%d + %d = %d \n",count,number-count,number);
            }
            count = nextPrime(count);
        }
        if(flag==0)
            System.out.println("no match found");

    }
    public static int nextPrime (int num) 
    {
        num++;
        while(true)
        {
            if(isPrime(num) == 1)
                return num;
            else 
                num++;
        }
        
    }
    public static int isPrime(int num)
    {
        int i,ans=1;
        for(i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                ans=0;
                return ans;
            }
        }
        return ans;
    }
    
}
