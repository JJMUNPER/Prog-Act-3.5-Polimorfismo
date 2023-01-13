public class Main {
    public static void main(String[] args) {

        Animal s;

        Instrumento a;


        s = new Bird();
        System.out.println("La Paloma: ");
        ((Bird) s).fly();
        s.speak();

        s = new Lion();
        System.out.println("El leon: ");
        s.speak();

        a=new Guitarra();
        a.tocar();

        a=new Tambor();
        a.tocar();

    }



}
