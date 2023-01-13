public class Bird extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("vuela");
    }

    @Override
    public void speak() {
        System.out.println("Pio Pio");;
    }
}
