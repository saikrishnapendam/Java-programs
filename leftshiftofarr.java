public class leftshiftofarr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,10,5,6,7,7,8};
        int temp=a[0];
        for(int x:a)
        {
            System.out.print(x+",");
        }
        System.out.println("");

        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        } 
        a[a.length-1]=temp;
        for(int x:a)
        {
            System.out.print(x+",");
        }
       
        
        
    }
    
}
