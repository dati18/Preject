package code;



public class Menu implements Comparable{
    String name;
    double price;
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString(){
        return name + " ---- " + String.format("%.2f",price);
    }
}

///STARTER*******
class Starter extends Menu implements Comparable {
    boolean Veggie;
    Starter(String name, double price, boolean Veggie){
        this.name = name;
        this.price = price;
        this.Veggie = Veggie;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString(){
        return name + " ----  " + String.format("%.2f",price) + "€ ---- Vegan friendly: " + Veggie;
    }
}

///MAIN DISHES -> Pork, Chicken, Beef
class MainCourse extends Menu implements Comparable{
    boolean Veggie;
    MainCourse(String name, double price, boolean Veggie){
        this.name = name;
        this.price = price;
        this.Veggie = Veggie;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString(){
        return name + " ---- " + String.format("%.2f",price) + "€ ---- Vegan friendly: " + Veggie;
    }
}

class Pork extends MainCourse{
    Pork(String name, double price, boolean Veggie) { super(name, price, Veggie); }
}
class Chicken extends MainCourse{
    Chicken(String name, double price, boolean Veggie) {
        super(name, price, Veggie);
    }
}
class Beef extends MainCourse{
    Beef(String name, double price, boolean Veggie) {
        super(name, price, Veggie);
    }
}
class Vegan extends MainCourse{
    Vegan(String name, double price, boolean Veggie){super (name, price, Veggie);}
}

///DESSERT
class Dessert extends Menu implements Comparable{
    boolean Veggie;
    Dessert(String name, double price, boolean Veggie){
        this.name = name;
        this.price = price;
        this.Veggie = Veggie;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString(){
        return name + " ----  " + String.format("%.2f",price) + "€ ---- Vegan friendly: " + Veggie;
    }
}

///DRINK
class Drink extends Menu implements Comparable{
    boolean Alcohol;
    Drink(String name, double price, boolean Alcohol){
        this.name = name;
        this.price = price;
        this.Alcohol = Alcohol;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString(){
        return name + " ----  " + String.format("%.2f",price) + "€ ---- Alcohol: " + Alcohol;
    }
}