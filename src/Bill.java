import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> product;

    public Bill(Customer customer){

        this.customer = customer;
    }

    public void addProduct(Product product, Integer quantity){
        this.product.put(product,quantity);
    }
    public Customer getCustomer(){
        return customer;
    }
    public Map<Product, Integer> getProucts(){
        return product;
    }
}
