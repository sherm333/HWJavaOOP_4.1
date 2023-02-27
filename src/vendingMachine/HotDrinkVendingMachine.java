package vendingMachine;

import product.HotDrink;
import product.Product;

public class HotDrinkVendingMachine<T extends Product> extends DrinkVendingMachine<HotDrink> {

    public HotDrinkVendingMachine(String name) {
        super(name);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (var el : productList) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return ht;
                }
            }
        }
        return null;
    }
}