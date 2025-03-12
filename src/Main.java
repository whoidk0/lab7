import java.util.Scanner;

class Product {
    String name;//наименование
    String manufacturer;//производитель
    double price;//ценв
    int term;//срок хранения(дней)
    int quantity;//колво
//крнструктор инициализирующий поля
    Product(String name, String manufacturer, double price, int term, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.term = term;
        this.quantity = quantity;
    }
//метод выводящий инфу о товаре
    void displayInfo() {
        System.out.println("наименование: " + name + ", производитель: " + manufacturer + ", цена: " + price + ", срок хранения: " + term + " дней, количество: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("сырок", "Молком", 50.0, 5, 100);
        products[1] = new Product("печенье", "Любятово", 69.99, 3, 200);
        products[2] = new Product("яблоки", "Гала", 120.0, 10, 500);
        products[3] = new Product("сыр", "Ламбер", 200.0, 15, 50);
        products[4] = new Product("йогурт", "Чудо", 60.0, 7, 120);

        System.out.println("введите наименование товара:");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();

        boolean found = false;//отслеживает найден ли товар
        for (Product product : products) {
            if (product.name.equalsIgnoreCase(productName)) {//проверка на совпадения товара и того что ввел польз
                product.displayInfo();//вывод
                found = true;//установка флага о том, что товар найден
            }
        }

        if (!found) {
            System.out.println("товара с наименованием '" + productName + "' нет.");
        }
    }
}