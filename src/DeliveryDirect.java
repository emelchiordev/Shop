public class DeliveryDirect  implements Delivery{
   @Override
    public double getPrice(){
        return 4.99;
    }
    @Override
    public String getInfo() {
       return "Livraison Direct : ";
    }
}
