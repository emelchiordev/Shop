public class Main {
    public static void main(String[] args) {
        Customer melchior = new Customer("MELCHIOR HENRI EMMANUEL","11 RUE YVES MANCEAU \n49330 QUERRE");
        System.out.println(melchior.getFullname());
        System.out.println(melchior.getAddress());
        Television Samsung1 = new Television("TV SAMSUNG EHD","TV INCURVED",5.30,55,"incurved");
        Product coca = new Product("Coca","Boison gazeuse",5.30);
        Bill facture1 = new Bill(melchior);

        facture1.addProduct(coca,2);
        facture1.addProduct(Samsung1,1);
    }
}