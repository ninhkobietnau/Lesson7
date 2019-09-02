package task10;

import java.util.Scanner;

public class HumanInformation {
    String name ;
    String address;

    HumanInformation(){
        name = "";
        address = "";
    }

    public void input () {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = inp.nextLine().trim();

        System.out.print("Enter address : ");
        address = inp.nextLine().trim();
    }
    public void changeAct(){}
}
