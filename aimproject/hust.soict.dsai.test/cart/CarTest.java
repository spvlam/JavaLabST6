public class CarTest {
    public static void main(String[] args) {
    Cart cart= new Cart();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
    "Animation", "Roger Allers", 87, 19.95f);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
    "Science Fiction", "George Lucas", 87, 24.95f);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Aladin",
    "Animation", 18.99f);
    cart.addDigitalVideoDisc(dvd1);
    cart.addDigitalVideoDisc(dvd2);
    cart.addDigitalVideoDisc(dvd3);
    // print cart
    cart.list(cart.getlDigitalVideoDiscs());
    // search method
    cart.searchTitle("Aladin");
    // the number of dvd has been created
    System.out.print(DigitalVideoDisc.getNumber());
    }
}