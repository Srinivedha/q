import java.io.*;
import java.util.*;
class Leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%4==0)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
