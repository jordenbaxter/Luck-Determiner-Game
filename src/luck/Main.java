package luck;

public class Main {

    private static int zeroOrOne;

    static void fiftyPercentChanceFunction() {
        int random = (int) Math.round(Math.random() * 10);
        if (random <= 5) {
            zeroOrOne = 0;
        } else {
            zeroOrOne = 1;
        }
    }

    public static void main (String[] args) {
        fiftyPercentChanceFunction();
        System.out.println(zeroOrOne);
        fiftyPercentChanceFunction();
        System.out.println(zeroOrOne);
        fiftyPercentChanceFunction();
        System.out.println(zeroOrOne);
        fiftyPercentChanceFunction();
        System.out.println(zeroOrOne);
        fiftyPercentChanceFunction();
        System.out.println(zeroOrOne);
    }
}