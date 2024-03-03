package products;


/**
 * Класс продукта со свойсвтвами <b>name</b> и <b>price</b>.
 */
public class Product {
    /** Поле название */
    private String name;

    /** Поле цена */
    private double price;

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param name название продукта
     * @param price цена продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Метод получения значения поля {@link Product#name}
     * @return возвращает название продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Метод получения значения поля {@link Product#price}
     * @return вовращает цену продукта
     */
    public double getPrice() {
        return price;
    }
}
