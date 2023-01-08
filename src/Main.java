public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.println(num + " არის მარტივი");
            } else {
                System.out.println(num + " არის შედგენილი");
            }
        }
        }
        public static boolean isPrime(int number){
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
