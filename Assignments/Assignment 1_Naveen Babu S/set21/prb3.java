import java.util.Scanner;

public class prb3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String word,ans,vowel;
        System.out.println("Enter the word");
        word = sc.nextLine();
        int len= word.length();int i,j=0;
        ans="";vowel="";
        vowel=vowelLetter(word, len);
        for(i=0;i<len;i++)
        {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                ans +=vowel.charAt(j);
                j++;
            }
            else
            {
                ans += word.charAt(i);
            }
        }
        System.out.println("Reversed String of Vowels is "+ans);
    }
    public static String vowelLetter(String word,int len)
    {
        String letter="";
        for(int i=0;i<len;i++)
        {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                letter += word.charAt(i);
            }
        }
        int length = letter.length();
        letter = revString(letter, length);
        return letter;
    }
    public static String revString(String word,int len)
    {
        String rev = "";
        for(int i=len-1;i>=0;i--)
        {
            rev += word.charAt(i); 
        }
        return rev;
    }
}
