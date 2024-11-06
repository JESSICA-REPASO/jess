interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {
    
    // This method simulates feeding the gorilla.
    // If it's time to eat, it returns true and prints a message.
    // Otherwise, it returns false.
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Putting gorilla food into cage"); // put gorilla food into cage
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    // This method simulates grooming the gorilla.
    @Override
    public void groom() {
        System.out.println("Grooming gorilla..."); 
        System.out.println("Lather, rinse, repeat"); // lather, rinse, repeat
    }

    // This method simulates petting the gorilla.
    @Override
    public void pet() {
        System.out.println("Approaching gorilla carefully...");
        System.out.println("Pet at your own risk"); // pet at your own risk
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Test the methods
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
