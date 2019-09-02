package task6;

import java.util.Scanner;

public class Bill {
    protected int billID , roomID;
    protected String date;
    protected String nameClient;
    protected int price;
    protected int money;

    public void input () {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter bill ID: ");
        billID = inp.nextInt();

        System.out.println("Enter room ID: ");
        roomID = inp.nextInt();

        System.out.println("Enter date/month/year of bill : ");
        inp.nextLine();
        date = inp.nextLine();

        System.out.println("Enter name of client: ");
        nameClient = inp.nextLine().trim();

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void output(){
        System.out.print(billID + "\t\t\t" + roomID + "\t\t\t" + nameClient + "\t\t" + date + "\t\t");
    }
}