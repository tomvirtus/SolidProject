package IO;

public class Data implements IData {

    private IReader reader;
    private IPrinter printer;

    public Data(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }


    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(int numder) {
        printer.print(numder);
    }

    @Override
    public int read() {
        return reader.read();
    }
}
