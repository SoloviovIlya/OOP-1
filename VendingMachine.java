public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}