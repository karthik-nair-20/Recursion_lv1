public class question1 {
    public static void main(String[] args) {
        print(5);

    }
    public static void print(int n)
    {
        if(n == 1)
        {
            System.out.println(1);
            return;
        }
        System.out.print(n);
        print(n-1);
    }
}
