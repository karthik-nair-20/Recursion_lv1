public class question7_prodOfDigits {
    public static void main(String[] args) {
        int ans = prodDigit(55);
        System.out.println(ans);

    }
    public static int prodDigit(int n)
    {
        if(n%10 == n) //or if(n <= 0) return 1; is ok!!
        {
            return n;
        }
        int rem = n%10;
        return rem * prodDigit(n/10);
    }
}
