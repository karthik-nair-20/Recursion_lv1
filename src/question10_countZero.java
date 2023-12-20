public class question10_countZero {
    public static void main(String[] args) {
        System.out.println(countZero(30204));

    }

    public static int countZero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        int rem = n%10;
        if(rem ==n)
        {
            return count;
        }
        if(rem==0)
        {
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
    }

