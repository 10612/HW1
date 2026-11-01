public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 10; // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(i);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
