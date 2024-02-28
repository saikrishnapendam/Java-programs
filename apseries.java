import java.util.*;
public class apseries {
    public static void main(String[] args) {
        int a,d,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start num,diff,no.of terms");
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.println(term);
            term=term+d;
        }
    }
    
}
