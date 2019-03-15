import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> product = new HashMap<>();
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
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de :");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de Livraison : "+delivery.getInfo()+delivery.getPrice());
        writer.writeLine("");
        writer.writeLine("Produits :");
        writer.writeLine("==================================");
        for(Map.Entry<Product,Integer> entry : product.entrySet()){
            writer.writeLine(entry.getKey().getName() +"-"+entry.getKey().getPrice() +" €"+" - "+entry.getValue()+" Unité(s)"+"%n");
        }
        writer.writeLine("");
        writer.writeLine("");
        writer.writeLine("Liraison : "+delivery.getPrice());
        writer.writeLine("==================================");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();


    }
    public double getTotal(){
        double total = delivery.getPrice();
        for(Map.Entry<Product,Integer> entry : product.entrySet()){

            total += entry.getKey().getPrice()*entry.getValue();

        }
        return total;
    }

}
