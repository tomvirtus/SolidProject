package IO;

public class PrinterStars implements IPrinter {
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int numder) {
        for (int i = 0; i < numder; i++) {
            print("*");
            System.out.println();
        }

    }
}
