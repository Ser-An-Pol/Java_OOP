import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine{
    private List<Product> productList;
    private Integer moneyBank;

    public HotDrinksMachine() {
        this.moneyBank = 0;
        initProducts();
    }

    @Override
    public void initProducts() {
        productList = new ArrayList<>();

        productList.add(new HotDrink("Water", 15, 300,98));
        productList.add(new HotDrink("Espresso", 110, 80,70));
        productList.add(new HotDrink("Espresso", 110, 70,70));
        productList.add(new HotDrink("Americano", 120, 140,80));
    }

    @Override
    public Product getProduct(String name) {
        for (var product : productList)
            if (product.getName().equals(name)) {
                moneyBank += product.getPrice();
                return product;
            }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (var product : productList)
            if (product.getName().equals(name) &&
                    ((HotDrink)product).getVolume() == volume &&
                    ((HotDrink)product).getTemperature() == temperature) {
                moneyBank += product.getPrice();
                return product;
            }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Integer getMoneyBank() {
        return moneyBank;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setMoneyBank(Integer moneyBank) {
        this.moneyBank = moneyBank;
    }
}
