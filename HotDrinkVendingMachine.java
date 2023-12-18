import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<HotDrink> products;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink product: products){
            if(product != null) {
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
