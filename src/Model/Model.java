package Model;

import IO.IData;
import IO.IPrinter;
import Service.IService;

public class Model {

    int a, b, sum;

    public void init(IData data) {
        a = data.input("Enter a: ");
        b = data.input("Enter d: ");
    }

    public void calc(IService service) {
        sum = service.calculate(a, b);
    }

    public void done(IPrinter printer) {
        printer.print("Result: ");
        printer.print(sum);
    }
}
