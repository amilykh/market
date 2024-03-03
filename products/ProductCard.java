package products;


/**
 * Класс карточки продукта со свойствами <b>product</b> и <b>quantity</b>.
 * (содержит информацию о том, сколько единиц объекта Product кладётся
 * покупателем в корзину для покупки.)
 */
public class ProductCard {
    /** Поле продукт */
    private Product product;

    /** Поле количество */
    private int quantity;

    /**
     * Конструктор - создание нового объекта карточка продукта
     *               с определёнными значениями
     * @param product продукт
     * @param quantity количество
     */
    public ProductCard(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Метод получения общей цены всех единиц поля {@link ProductCard#product}
     *
     * @return  возвращает  общую цену за всё количество объекта продукт,
     * положенное покупателем в корзину
     */
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    /**
     * Метод возвращает детальную информацию о продукте в корзине.
     * @return детальная информация о продукте в корзине (название, количество,
     * общая цена)
     */
    public String getProductInfo() {
        return product.getName() + " " + product.getPrice() + " x" +
                quantity + " - " + getTotalPrice() + " руб.";
    }
}
