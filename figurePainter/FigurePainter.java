package figurePainter;

public class FigurePainter {

    public void figureOne(int countOfLines, char symbol) {
        for (int i = 0; i < countOfLines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }

    }

    public void figureTwo(int countOfLines) {
        for (int i = 0; i < countOfLines; i++) {
            for (int j = countOfLines - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void figuretree(int countOFLines) {
        for (int i = 0; i < countOFLines; i++) {
            for (int j = 0; j <= countOFLines - 1 - i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void figurefive(int countOfLines) {
        for (int i = countOfLines - 1; i >= 0; i--) {
            for (int j = 0; j < countOfLines - 1 - i; j++) {
                System.out.print(" ");

            }
            for (int j = countOfLines - i - 1; j < countOfLines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void figuresex(int countOfLines) {
        for (int i = 0; i < countOfLines; i++) {
            for (int j = 0; j < countOfLines - 1 - i; j++) {
                System.out.print(" ");

            }
            for (int j = countOfLines - i - 1; j < countOfLines; j++) {
                System.out.print(" *");


            }
            System.out.println();
        }
        for (int i = 2; i>=0 ; i--) {
            for (int j = 0; j <3-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 2-i-1; j < 2; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}





