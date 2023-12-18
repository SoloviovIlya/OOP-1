import java.util.List;

public class BottleofWaterVendingMachine implements VendingMachine {
    private final List<BottleofWater> products;

    public BottleofWaterVendingMachine(List<BottleofWater> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(BottleofWater product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleofWater getProduct(String name, int volume){
        for(BottleofWater product: products){
            if(product != null){
                if(product.getName().equalsIgnoreCase(name) && ((BottleofWater) product).getVolume() == volume){
                    return (BottleofWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}