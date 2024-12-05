
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        int i = 0;
        ArrayList<Computer> computers = new ArrayList<>();

        computers.add(new Desktop("2020", "IBM", "Linux", 1000));
        computers.add(new Laptop("2024", "HP", "Win", 100, 60));
        computers.add(new Notebook("2022", "Apple", "MacOs", 100, 40));

        System.out.println("No.\tModelo\t Marca\tSO\tTipo");

        for (Computer computer : computers) {
            ++i;
            System.out.printf("%d %s %s\n", i, computer.toString(), computer.getComputerType());
        }
    }

}
