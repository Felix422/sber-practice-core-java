package task5;

public class PizzaOrder {
    String name;
    Size size;
    boolean sauce;
    String address;
    boolean orderAccepted = false;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void order() {
        if (!orderAccepted) {
            orderAccepted = true;
            System.out.print("Заказ принят. ");


            switch (size) {
                case BIG:
                    System.out.print("Большая ");
                    break;
                case MEDIUM:
                    System.out.print("Средняя ");
                    break;
                case SMALL:
                    System.out.print("Маленькая ");
                    break;
            }
            System.out.print("пицца " + name);

            if (sauce) {
                System.out.print(" с соусом");
            }

            System.out.println(" на адрес " + address);

        } else {
            System.out.println("Заказ уже принят");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            orderAccepted = false;
            System.out.println("Заказ отменён");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setSize(Size s) {
        size = s;
    }

    public Size getSize() {
        return size;
    }

    public void setSauce(boolean s) {
        sauce = s;
    }

    public boolean getSauce() {
        return sauce;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void tooString() {
        System.out.println("Заказ:");
        System.out.println("\tНаименование: " + name);
        System.out.println("\tРазмер: " + size);
        if (sauce) {
            System.out.println("\tС соусом");
        }
        System.out.println("\tАдрес: " + address);
        if (orderAccepted) {
            System.out.println("\tПринят");
        } else {
            System.out.println("\tНе принят");
        }
    }

}