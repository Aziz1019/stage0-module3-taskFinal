package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String s = Integer.valueOf(number).toString();
        char c = s.charAt(0);
        char c1 = s.charAt(1);
        char c2 = s.charAt(2);
        char c3 = s.charAt(3);
        int sum = Character.getNumericValue(c) + Character.getNumericValue(c1) + Character.getNumericValue(c2) + Character.getNumericValue(c3);
        System.out.println(sum);
    }
}
