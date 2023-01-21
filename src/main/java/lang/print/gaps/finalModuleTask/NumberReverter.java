package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String s = Integer.valueOf(number).toString();
        char c = s.charAt(0);
        char c1 = s.charAt(1);
        char c2 = s.charAt(2);
        String reverted = "" + c2 + c1 + c;
        System.out.println(reverted);
    }
}
