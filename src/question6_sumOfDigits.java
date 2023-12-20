public class question6_sumOfDigits {
    public static void main(String[] args) {
        int ans = sumDigit(1342);
        System.out.println(ans);
    }

    private static int sumDigit(int n) {
        if(n <= 0)
        {
            return 0;
        }
        int rem = n%10;
        return sumDigit(n/10) + rem;
    }
}
