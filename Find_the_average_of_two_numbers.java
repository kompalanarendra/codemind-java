import java.util.*;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float sum=a+b;
        float avg=sum/2;
        Formatter fm=new Formatter();
        fm.format("%.4f",avg);
        System.out.println(fm);
    }
}