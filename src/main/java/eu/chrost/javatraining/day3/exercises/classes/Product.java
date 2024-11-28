package eu.chrost.javatraining.day3.exercises.classes;

import java.math.BigDecimal;
import java.util.Objects;

/*

Zadanie 8: Klasa Product
1.	Utwórz klasę Product z polami:
o	String name
o	double price
o	int quantity
2.	Dodaj metody:
o	double calculateTotalPrice() – oblicza łączną cenę produktu (price * quantity).
o	boolean isSamePrice(Product other) – sprawdza, czy dwa produkty mają taką samą cenę.
3. Nadpisz metode equals() - tak aby porownywala czy dwa prodkty maja te same wartosci pol
4. Nadpisz metode toString() - tak aby zwracala wartosci pol
5.	W main():
o	Utwórz kilka obiektów klasy Product, ustawiając wartości pól bezpośrednio.
o	Porównaj obiekty za pomocą equals() i ==.
o	Oblicz łączną cenę produktów.
 */

public class Product {
    public String name;
    public BigDecimal price;
    public int quantity;

    public BigDecimal calculateTotalPrice() {
        return price.multiply(new BigDecimal(quantity));
    }

    public boolean isSamePrice(Product other) {
        return other != null && Objects.equals(this.price, other.price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product product) {
            return Objects.equals(product.name, this.name)
                    && Objects.equals(product.price, this.price)
                    && product.quantity == this.quantity;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Lalka";
        p1.price = new BigDecimal("23.67");
        p1.quantity = 5;

        Product p2 = new Product();
        p2.name = "Miś";
        p2.price = new BigDecimal("15.00");
        p2.quantity = 10;

        Product p3 = new Product();
        p3.name = "Kubek";
        p3.price = new BigDecimal("12.11");
        p3.quantity = 5;

        Product p4 = new Product();
        p4.name = "Kubek";
        p4.price = new BigDecimal("12.11");
        p4.quantity = 5;
        System.out.println("Czy p1 równe p2: " + p1.equals(p2));
        System.out.println("Czy p2 równe p3: " + p2.equals(p3));
        System.out.println("Czy p3 równe p1: " + p3.equals(p1));
        System.out.println("Czy p3 równe p4: " + p3.equals(p4));

        System.out.println("p1: " + p1);
        System.out.println("Total price for p1: " + p1.calculateTotalPrice());
        System.out.println("p1 price equal to p2 price " + p1.isSamePrice(p2));
        System.out.println("p3 price equal to p4 price " + p3.isSamePrice(p4));

    }

}
