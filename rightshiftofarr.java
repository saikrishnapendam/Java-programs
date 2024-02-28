public class rightshiftofarr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
       int temp=a[a.length-1];
       for(int x:a)
       System.out.print(x+",");
       for(int i=a.length-2;i>=0;i--)
       {
        a[i+1]=a[i];
       }
       System.out.println("");
       a[0]=temp;
       for(int x:a)
         System.out.print(x+",");
    }
    
}
