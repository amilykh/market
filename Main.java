import market.Customer;
import market.Market;
import market.QueueAction;
import products.Cart;
import products.Product;
import products.ProductCard;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product banana = new Product("Бананы в упаковке", 125.00);
        Product apple = new Product("Яблоки сезонные", 110.00);

        // Создание корзины первого покупателя
        Cart cart1 = new Cart();
        cart1.addProduct(new ProductCard(banana, 3));
        cart1.addProduct(new ProductCard(apple, 2));

        // Создание корзины второго покупателя
        Cart cart2 = new Cart();
        cart2.addProduct(new ProductCard(apple, 1));

        // Создание первого покупателя
        Customer customer1 = new Customer("Иван", cart1);
        // Создание второго покупателя
        Customer customer2 = new Customer("Светлана", cart2);

        // Создаём список покупателей и добавляем  в него покупателей
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);


        // На основе списка покупателей создаём объект магазин
        Market market = new Market(customers);

        // Добавляем покупателей в очередь магазина
        market.marketBehavior(customer1, QueueAction.ADD);
        market.marketBehavior(customer2, QueueAction.ADD);

        // Обслуживаем покупателя
        market.update();
        // Обслуживаем покупателя
        market.update();
    }
}
