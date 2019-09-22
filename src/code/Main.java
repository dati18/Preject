package code;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //STARTER
        ArrayList<Starter> starter = new ArrayList<Starter>();
        Starter s1 = new Starter("s1. French Fries   ", 3.50, true);
        starter.add(s1);
        Starter s2 = new Starter("s2. Ceasar Salad   ", 4.50, true);
        starter.add(s2);

        //MAIN COURSES
        ArrayList<MainCourse> mainCourse = new ArrayList<MainCourse>();
        MainCourse m1 = new Pork("m1. Schnitzel      ", 12.50, false);
        mainCourse.add(m1);
        MainCourse m2 = new Chicken("m2. Hot wings      ", 10.00, false);
        mainCourse.add(m2);
        MainCourse m3 = new Beef("m3. Steak          ", 15.00, false);
        mainCourse.add(m3);
        MainCourse m4 = new Vegan("m4. Mushroom       ", 10.00, true);
        mainCourse.add(m4);

        //DESSERTS
        ArrayList<Dessert> dessert = new ArrayList<Dessert>();
        Dessert d1 = new Dessert("d1. Tiramisu       ", 5.50, false);
        dessert.add(d1);
        Dessert d2 = new Dessert("d2. Ice cream      ", 4.50, true);
        dessert.add(d2);

        //DRINKS
        ArrayList<Drink> drink = new ArrayList<Drink>();
        Drink b1 = new Drink("b1. Bier           ", 4.00, true);
        drink.add(b1);
        Drink b2 = new Drink("b2. Soda           ", 3.00, false);
        drink.add(b2);

        //*****************************************************//

        System.out.println("WELCOME TO MY RESTAURANT");                 //SHOW MENU
        System.out.println(" ------------------- ");                    //SHOW MENU
        System.out.println(" ------------------- ");                    //SHOW MENU
        System.out.println("STARTERS");
        for (Starter str1 : starter) {
            System.out.println(str1);
        }
        System.out.println("MAIN COURSES");
        for (MainCourse str2 : mainCourse) {
            System.out.println(str2);
        }
        System.out.println("DESSERTS");
        for (Dessert str3 : dessert) {
            System.out.println(str3);
        }
        System.out.println("BEVERAGES");
        for (Drink str4 : drink) {
            System.out.println(str4);
        }
        System.out.println(" ------------------- ");
        System.out.println("TYPE the code name of the dish your want to order, for example type 's1' if you want some French Fries");
        System.out.println("PRESS 0 to view your order");
        System.out.println("PRESS 'x' to escape and store your order");
        System.out.println(" ------------------- ");

        ArrayList<Menu> order = new ArrayList<Menu>();                  //ArrayList to store orders
        Scanner input = new Scanner(System.in);
        boolean exit = false;                                        //Exit loop
        double total = 0;                                            //total of the bill
        double tax = 0;
        Date date=java.util.Calendar.getInstance().getTime();
        do{
            String a = input.next();
            switch (a) {
                case "s1":
                    System.out.println("you have ordered one " + s1.name + "--- price: " + s1.price);
                    order.add(s1);
                    total += s1.price;
                    break;
                case "s2":
                    System.out.println("you have ordered one " + s2.name + "--- price: " + s2.price);
                    total += s2.price;
                    order.add(s2);
                    break;
                case "m1":
                    System.out.println("you have ordered one " + m1.name + "--- price: " + m1.price);
                    total += m1.price;
                    order.add(m1);
                    break;
                case "m2":
                    System.out.println("you have ordered one " + m2.name + "--- price: " + m2.price);
                    total += m2.price;
                    order.add(m2);
                    break;
                case "m3":
                    System.out.println("you have ordered one " + m3.name + "--- price: " + m3.price);
                    total += m3.price;
                    order.add(m3);
                    break;
                case "m4":
                    System.out.println("you have ordered one " + m4.name + "--- price: " + m4.price);
                    total += m4.price;
                    order.add(m4);
                    break;
                case "d1":
                    System.out.println("you have ordered one " + d1.name + "--- price: " + d2.price);
                    total += d1.price;
                    order.add(d1);
                    break;
                case "d2":
                    System.out.println("you have ordered one " + d2.name + "--- price: " + d2.price);
                    total += d2.price;
                    order.add(d2);
                    break;
                case "b1":
                    System.out.println("you have ordered one " + b1.name + "--- price: " + b1.price);
                    total += b1.price;
                    order.add(b1);
                    break;
                case "b2":
                    System.out.println("you have ordered one " + b2.name + "--- price: " + b2.price);
                    total += b2.price;
                    order.add(b2);
                    break;
                case "0":
                    for (Menu str5 : order) {
                        System.out.println(str5);
                    }
                    System.out.println("Total: " + String.format("%.2f", total) +"€");
                    tax = total * 0.19;
                    break;
                case "x":
                    PrintWriter writer = new PrintWriter("Bill.txt", "UTF-8");      //Create a txt file to store orders
                    writer.println("NUMBER 1 RESTAURANT IN DA WORLD");
                    writer.println(" ");
                    writer.println("*************************");
                    writer.println(" ");
                    writer.println(date);
                    writer.println(" ");
                    writer.println("____FOOD_________________Price_________________");
                    for (Menu str5 : order) {
                        writer.println(str5);
                    }
                    writer.println("                                         Tax: " + String.format("%.2f", tax) +"€");
                    writer.println("                                         Total: " + String.format("%.2f", total) +"€");
                    writer.println(" ");
                    writer.println(" ");
                    writer.println("Thank you");
                    writer.println(" ");
                    writer.println("*************************");
                    writer.close();
                    exit = true;
                    break;

                    default:
                        System.out.println("Invalid option, please choose again");
                        break;
            }
    }while (!exit);
    }
}

