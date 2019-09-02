package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Bill array[] = new Bill[100];

        int count = 0;
        int sum = 0;
        int sumBillHour = 0;
        int sumBillDay = 0;
        boolean check = true;


        while(check){
            System.out.println("1. Bill hour :");
            System.out.println("2. Bill day :");
            System.out.println("0. Exit !");

            int choose;
            System.out.print("Enter your choose: ");
            choose = inp.nextInt();

            switch (choose){
                case 1:{
                    System.out.println("\nBill hour.");
                    array[count] = new BillHour();
                    array[count].input();
                    count++;
                    sumBillHour ++;
                    break;
                }

                case 2:{
                    System.out.println("\nBill day.");
                    array[count] = new BillDay();
                    array[count].input();
                    count++;
                    sumBillDay ++;
                    break;
                }

                case 0:{
                    check = false;
                    break;
                }
            }
        }

        System.out.println("\nBill by hours: " + sumBillHour);
        System.out.println("Bill by date: "+ sumBillDay);

        System.out.println("Bill ID \t\tRoom ID\t\t name\t\tDate Bill \t\tRent");
        System.out.println();
        for(int i = 0; i < count; i ++){
            array[i].output();
            System.out.println();
            sum += array[i].money;
        }

        System.out.println("\nSum money we have : " + sum);
    }
}
