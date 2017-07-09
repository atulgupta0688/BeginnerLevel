import java.util.*;
import java.lang.*;
import java.io.*;
class even
{
public static void main (String[] args) throws java.lang.Exception
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(read);
    {
        System.out.print("Enter the number");
        int k=Integer.parseInt(br.readLine());
        if(k%2==0)
        {
            System.out.print("The number is even");
        }
        else
        {
             System.out.print("The number is odd");
            }
        }
    }
}