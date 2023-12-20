public class question8_revAnumber {
    public static void main(String[] args) {
        int ans = reverseNum(1824);
        System.out.println(ans);


    }
//    public static int reverseNum(int n)
//    {
//        if(n%10 == n)
//        {
//            return n;
//        }
//        int rem = n%10;
//        System.out.print(rem);
//       return reverseNum(n/10);
//    }
//APPROACH 1
//    static int sum=0;
//    public static void reverseNum(int n)
//    {
//        if(n==0)
//        {
//             return;
//        }
//        int rem = n%10;
//        sum = sum*10 + rem;
//        reverseNum(n/10);
//    }

//APPROACH 2 using Helper Function
public static int reverseNum(int n){
        int digits = (int)(Math.log10(n))+1; //math videos discussed
        return helperFunction(n, digits);
}

public static  int helperFunction(int n, int args)
{
    if(n%10 == n)
    {
        return n;
    }
    int rem = n%10;
    return rem * (int)Math.pow(10,args-1) + helperFunction(n/10,args-1);

}

}
