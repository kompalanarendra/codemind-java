import java.util.*;
class Area_Of_Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float area=(float)3.14*r*r;
        Formatter fm=new Formatter();
        fm.format("%.2f",area);
        System.out.println(area);
    }
}