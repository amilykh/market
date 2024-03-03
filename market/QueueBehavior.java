package market;


/**
 * Интерфейс поведение очереди
 */
public interface QueueBehavior {
    /**
     * Метод помещает человека  в очередь и удаляет человека из очереди
     * @param customer покупатель
     * @param action вид действия ( ADD - добавление, DELETE - удаление)
     */
    void marketBehavior(Customer customer, QueueAction action);

    /**
     * Метод обновляет состояние магазина (принимает и отдаёт заказы)
     */
    void update();
}
