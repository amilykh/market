package products;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс корзина со свойством <b>products</b>.
 */
public class Cart {
    /** Поле продукты */
    private List<ProductCard> products = new ArrayList<>();

    /**
     * Метод добавления в поле {@link Cart#products} карты продукта
     *
     * @param productCard карта продукта
     */
    public void addProduct(ProductCard productCard) {
        products.add(productCard);
    }


    /**
     * Методы вывода информации о содержимом корзины.
      */
    public void printCart() {
        for (ProductCard card : products) {
            System.out.println(card.getProductInfo());
        }
    }

    /**
     * Метод вывода общей цены всего содержимого корзины.
     * @return цена содержимого корзины.
     */
    public double getTotalPrice() {
        double total = 0;
        for (ProductCard card : products) {
            total += card.getTotalPrice();
        }
        return total;
    }
}
