package party;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        Partition partition = new Partition();
        long number = 20;
        long p = partition.value(number);
        printer.print("Resultado:P("+number+") = " + p);

    }
}
