import java.util.*;
class Celsius_To_Fahrenheit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float f=(float)(32+(c*9/5));
        Formatter fm=new Formatter();
        fm.format("%.2f",f);
        System.out.println(fm);
    }
}