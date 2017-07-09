import java.util.*;
import java.lang.*;
import java.io.*;
class vowel
{
    public static void main (String[] args) throws java.lang.Exception
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(read);
    {
        System.out.print("Enter the character");
        char ch = (char) br.read(); 
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }
}
}

       