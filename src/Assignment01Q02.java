public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int denominator = 1;
        byte sign = 1;
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            approxPi += 4.0 / denominator;
            denominator = (denominator + sign * 2) * -1;
            sign *= -1;
        }
        
        System.out.println(approxPi + " " + actualPi);
    }
}
