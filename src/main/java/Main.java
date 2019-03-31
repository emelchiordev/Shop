public class Main {
    public static void main(String[] args) {
        Product cafe = new Product("CAFETIERE","CAFETIERE AVEC DOSETTE",50);
        Customer melchior = new Customer("MELCHIOR HENRI EMMANUEL","11 RUE YVES MANCEAU - 49330 QUERRE");
        DeliveryDirect livraison = new DeliveryDirect();
        Bill facture1 = new Bill(melchior,livraison);
        facture1.addProduct(cafe,1);
        Writer writer = new FileWriter();
       try { facture1.generate(writer);}
       catch (NoProductInBill e) {
           System.out.println("Vous n'avez pas choisi de produits");
       }


    }
}