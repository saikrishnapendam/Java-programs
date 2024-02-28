public class bitwise {
    public static void main(String[] args) {
        int a=5,b=4,c,d;
        //c=a&b;
        //c=a|b;
        //c=a^b;
        // c=a<<1;
        //c=a>>1;
        //c=0b0101;
        // c=-0b1010;
        // d=c>>1;
        //c=-0b1010;
        //d=c>>>1;
        c=5;
        d=~c;
        
     System.out.println(String.format("32%s",Integer.toBinaryString(c)));
     System.out.println(d);
    }
}


