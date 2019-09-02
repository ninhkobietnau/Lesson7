package task10;

import java.util.Scanner;

public class Client extends HumanInformation {
    private String model;
    private Scanner inp = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.println("Car's model :");
        model = inp.nextLine();
    }

    private void output() {
        System.out.println(name + "\t\t" + address + "\t\t" + model);
    }

    public void changeAct() {
        Client client = new Client();
        client.input();
        client.output();
    }
}
