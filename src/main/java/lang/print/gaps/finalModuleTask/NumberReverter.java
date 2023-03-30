package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        int reversed = c * 100 + b * 10 + a;
        System.out.println(reversed);
    }
}
