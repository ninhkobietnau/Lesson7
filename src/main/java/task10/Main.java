package task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanInformation[] human = new HumanInformation[10];
        Scanner inp = new Scanner(System.in);
        boolean check = true;
        int select;
        int count =0;

        while (check) {
            System.out.println("1.Student :");
            System.out.println("2.Employee :");
            System.out.println("3.Client :");
            System.out.println("0.Exit");
            System.out.println("Enter your choose : ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    human[count] = new Student();
                    human[count].changeAct();
                    count++;
                    break;
                case 2:
                    human[count] = new Employee();
                    human[count].changeAct();
                    count++;
                    break;
                case 3:
                    human[count] = new Client();
                    human[count].changeAct();
                    count++;
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    break;
            }
        }
    }
}
