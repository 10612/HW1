public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        
        int f1 = 1, f2 = 1, numOdd = 2 * (x + 1) / 3;
        for (int i = 2; i < x; i++) {
            System.out.print(f1 + " ");
            f2 += f1;
            f1 = f2 - f1;
        }
        System.out.println(f1 + " " + f2);
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
