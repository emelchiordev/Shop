public class Main {
    public static void main(String[] args) {
        Writer ecriture = new FileWriter();
        Customer client = new Customer("EMMANUEL MELCHIOR", "11 RUE YVES MANCEAU - 49330 QUERRE");
        Product cafe = new Product("Cafetière","Cafetière de marque BEKO",59.30);
        Fridge fridge = new Fridge("Frigidère","Fridigère de marque SAMSUNG",599.90,50,true);
        Television tv = new Television("Télévision","TV de marque PANASONIC",260,55,"test");
        RelayDelivery delivery = new RelayDelivery(27);
        RelayDelivery lowCostRelayDelivery = new RelayDelivery(1);
        Bill facture1 = new Bill(client,delivery);
        facture1.addProduct(cafe,1);
        facture1.addProduct(fridge,1);
        facture1.addProduct(tv,2);
        facture1.generate(ecriture);
    }
}