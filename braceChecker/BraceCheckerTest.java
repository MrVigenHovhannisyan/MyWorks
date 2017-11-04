package braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("(Hello}");

        braceChecker.check();
    }
}
