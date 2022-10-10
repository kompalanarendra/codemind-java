import java.util.*;
class Multiplication
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float m=a*b;
        Formatter f=new Formatter();
        f.format("%.2f",m);
        System.out.println(f);
    }
}