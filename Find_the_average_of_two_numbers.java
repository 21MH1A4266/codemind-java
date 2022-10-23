import java.util.Scanner;
class Avg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N,M;
        float Avg;
        N=s.nextInt();
        M=s.nextInt();
        Avg=(float)(N+M)/2;
        System.out.format("%.4f",Avg);
    }
}