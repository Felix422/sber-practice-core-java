package task1;

public class Phone {
    int number = 123456789;
    String model = "iPhone";
    int weight = 20;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return number;
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", номер " + number);
    }

    public static void sendMessage(int n1, int n2, int n3) {
        int[] numbers = {n1, n2, n3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + 1 + "] " + numbers[i]);
        }
    }

    public void tooString() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight);
    }

}
