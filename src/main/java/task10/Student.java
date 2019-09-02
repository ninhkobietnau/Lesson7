package task10;

import java.util.Scanner;

public class Student extends HumanInformation {
    private double point1;
    private double point2;

    private Scanner inp = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.println("Enter point 1st : ");
        point1 = inp.nextDouble();

        System.out.println("Enter point 2nd :");
        point2 = inp.nextDouble();
    }

    private void output() {
        System.out.println(name + "\t\t" + address + "\t\t" + point1 + "\t\t" + point2);
    }

    private void changePoint (Student st , double changePoint1 , double changePoint2) {
        st.point1 = changePoint1;
        st.point2 = changePoint2;
    }

    public void changeAct() {
        Student st = new Student();
        int select;
        double point;

        st.input();

        System.out.println("1.Change point 1st");
        System.out.println("2.Change point 2nd");

        System.out.println("Select: ");
        select = inp.nextInt();

        switch (select){

            case 1:{
                System.out.println("Enter new point: ");
                point = inp.nextDouble();
                changePoint(st , point , st.point2);
                break;
            }

            case 2:{
                System.out.println("Enter new point: ");
                point = inp.nextDouble();
                changePoint(st , st.point1,point);
                break;
            }
        }

        double sumPoint = st.point1 + st.point2;
        st.output();
        System.out.println("Sum point = " + sumPoint);
    }
}
