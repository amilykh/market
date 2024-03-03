package market;

import products.Cart;


/**
 * Класс покупатель со свойствами <b>name</b> и <b>cart</b>.
 */
public class Customer {
    /** поле имя покупателя */
    private String name;

    /** поле корзина покупателя */
    private Cart cart;

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param name имя покупателя
     * @param cart корзина покупателя
     */
    public Customer(String name, Cart cart) {
        this.name = name;
        this.cart = cart;
        //this.cart = new Cart();
    }

    /**
     * Метод получения значения поля {@link Customer#name}
     * @return возвращает имя покупателя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод получения значения поля {@link Customer#cart}
     * @return возвращает корзину покупателя
     */
    public Cart getCart() {
        return cart;
    }
}
