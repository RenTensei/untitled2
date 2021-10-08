public class Fuctorial1 {
    public static void main(String[] args) {
        System.out.println(fuct(17));
    }


    public static long fuct(int n){
        if (n <=1){
            return 1;
        }

        long res = n*fuct(n-1);
        System.out.println(res);
        return res;

    }

    }

