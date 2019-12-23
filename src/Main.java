import IO.*;
import Model.Module;
import Service.IService;
import Service.ServiceSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConssole();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();
        Module module = new Module(reader, printer, service);
        module.execute();
    }
}
