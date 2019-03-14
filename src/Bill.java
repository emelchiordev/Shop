import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> product;
    private Delivery delivery;


    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
    }

    public void addProduct(Product product, Integer quantity){
        this.product.put(product,quantity);
    }
    public Customer getCustomer(){
        return customer;
    }
    public Map<Product, Integer> getProducts(){
        return product;
    }
    public void generate(Writer writer){

    }
    public double getTotal(){
        return 0;
    }

}
