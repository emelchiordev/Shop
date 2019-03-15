public class ExpressDelivery implements Delivery {
    String ville;
    public ExpressDelivery(String ville){
        this.ville = ville;
    }
    @Override
    public double getPrice(){
        if (ville == "Paris"){
            return 6.99;
        }else {
            return 9.99;
        }
   }
    @Override
    public String getInfo() {
        return "Livraison Express : ";
    }
}
