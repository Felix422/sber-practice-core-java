package task1;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone(987654, "Xiaomi");
        Phone p2 = new Phone(945616, "Samsung", 15);
        Phone p3 = new Phone();

        p1.receiveCall("Константин");

        System.out.println("Номер" + p1.getNumber());

        Phone.receiveCall("Владимир", p2.number);

        Phone.sendMessage(p1.number, p2.number, p3.number);

        p3.tooString();
    }
}