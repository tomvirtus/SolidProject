package IO;

public class PrinterConssole implements IPrinter {
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int numder) {
        System.out.println(numder);
    }
}
