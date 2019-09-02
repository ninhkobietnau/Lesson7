package task6;

import java.util.Scanner;

public class BillDay extends Bill {
    private int day;

    public void input(){
        super.input();
        super.setPrice(100);

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter rent day: ");
        day = inp.nextInt();
    }

    public void output(){
        super.output();
        System.out.print(day);

        if(day <= 7){
            money = day * super.getPrice();
        } else {
            money = (int) ((7 * super.getPrice() ) + (day  - 7) * super.getPrice() * 0.8);
        }
    }
}
