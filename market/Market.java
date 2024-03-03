package market;

import products.Cart;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс Магазин со свойствами <b>queue</b> и <b>customer</b>.
 */
public class Market implements QueueBehavior {
    /** Поле очередь */
    final private List<Customer> queue = new ArrayList<>();
    /** Поле покупатель */
    final private List<Customer> customers;

    /**
     * Конструктор - создание нового объекта с определённым значением
     * @param customers покупатели магазина
     */
    public Market(List<Customer> customers) {
        this.customers = customers;
    }


    /**
     * Метод помещает покупателя в очередь или удаляет из неё
     * @param customer покупатель
     * @param action вид действия ( ADD - добавление, DELETE - удаление)
     */
    @Override
    public void marketBehavior(Customer customer, QueueAction action) {
        switch (action) {
            case ADD:
                queue.add(customer);
                break;
            case DELETE:
                queue.remove(customer);
                break;
        }
    }

    /**
     * Метод обновляет состояние магазина (принимает и отадёт заказы)
     */
    @Override
    public void update() {
        if (!queue.isEmpty()) { // если очередь не пуста,
            Customer customer = queue.get(0); // обслуживаем првого покупателя
            // Печать имени покупателя, содержимого его корзины  и общей суммы
            System.out.println("Чек покупателя " + customer.getName() + ":");
            Cart cart = customer.getCart();
            cart.printCart();
            System.out.println("ИТОГ: " + cart.getTotalPrice() + " руб.\n");
            // После выдачи чека удаляем покупателя из очереди
            queue.remove(customer);
            
        }
    }
}
