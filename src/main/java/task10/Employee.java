package task10;

import java.util.Scanner;

public class Employee extends HumanInformation{
    private int salary;
    private String post;

    private Scanner inp = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.println("Enter salary :");
        salary = inp.nextInt();
        System.out.println("Enter post: ");
        inp.nextLine();
        post = inp.nextLine();
    }

    private void output() {
        System.out.println(name + "\t\t" + address + "\t\t" + salary + "\t\t" + post);
    }

    private void changeIn4Employ(Employee emp, int changeSalary, String changePost) {
        emp.salary = changeSalary;
        emp.post = changePost;
    }

    public void changeAct() {
        Employee emp = new Employee();
        int select;
        int newSalary;
        String newPost;

        emp.input();

        System.out.println("1.Change salary ");
        System.out.println("2.Change post ");

        System.out.println("Enter your select: ");
        select = inp.nextInt();
        switch (select) {
            case 1: {
                System.out.println("New salary : ");
                newSalary = inp.nextInt();
                changeIn4Employ(emp, newSalary, emp.post);
                break;
            }

            case 2: {
                System.out.println("New post :");
                inp.nextLine();
                newPost = inp.nextLine();
                changeIn4Employ(emp, emp.salary, newPost);
                break;
            }
        }
        emp.output();
    }
}
