public class Main {
    public static void main(String[]args){

        Books book1= new Books("Pidi Baiq", "Dilan 1998", 120000, 86127353);
        Books book2 = new Books("Raditya Dika", "Marmut Merah Jambu", 120000, 96709573);
        Books book3 = new Books("Nadzira Shafa", "172 Days", 250000, 76566324);

       
        double totalPrice = book1.getPrice()+book2.getPrice()+book3.getPrice();
        System.out.println("Name    : Nahla Salsabila M.");
        System.out.println("NIM     : 20220040257 ");
        System.out.println("==========|BILL|==========");
        System.out.println("Order : Books ");
        System.out.println(book1.title+":"+book1.price);
        System.out.println(book2.title+":"+book2.price);
        System.out.println(book3.title+":"+book3.price);
        System.out.println("Total Rp."+ totalPrice);
        System.out.println("========|THANK YOU|========");
    }

}
