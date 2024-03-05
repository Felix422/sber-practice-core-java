package task5;

public class Main {
    public static void main(String[] args){
        PizzaOrder p = new PizzaOrder("Маргарита", Size.SMALL, false,"Мира 90-91");

        p.order();
        p.order();
        p.cancel();
        p.cancel();
        p.tooString();
    }
}
