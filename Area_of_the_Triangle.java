import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        float s=(a+b+c)/2;
        float area=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        Formatter fm=new Formatter();
        fm.format("%.2f",area);
        System.out.println(fm);
    }
}