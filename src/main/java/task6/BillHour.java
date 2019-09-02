package task6;

import java.util.Scanner;

public class BillHour extends Bill {
    private int hour;

    public void input(){
        super.input();
        super.setPrice(15);

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter rent hour: ");
        hour = inp.nextInt();
    }

    public void output(){
        super.output();
        System.out.print(hour);

        if (hour <= 24) {
            money = hour * super.getPrice();
        } else if (hour < 30) {
            money = super.getPrice() *24;
        }
    }

}
