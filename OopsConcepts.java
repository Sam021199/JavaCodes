public class OopsConcepts{

    public static void main(String[] args) {

        // --------------------
        // Polymorphism + Inheritance (Domestic Animals)
        // --------------------
        DomesticAnimal dog = new StreetDog();
        DomesticAnimal cat = new StreetCat();

        dog.sound();   // Calls StreetDog's sound()
        dog.color();   // Calls DomesticAnimal's color()

        cat.sound();  // Calls DomesticAnimal's sound()
        cat.color();  // Calls StreetCat's color()

        // --------------------
        // Abstraction using Interface
        // --------------------
        WildAnimal tiger = new Tiger();
        tiger.wildSound();
        tiger.wildColor();

        // --------------------
        // Abstraction using Abstract Class
        // --------------------
        WildAnimalAbstract lion = new Lion();
        lion.wildSound();
        lion.wildColor();
    }
}

// --------------------
// ABSTRACTION (Interface)
// --------------------
interface WildAnimal {
    void wildSound();
    void wildColor();
}

// --------------------
// IMPLEMENTATION
// --------------------
class Tiger implements WildAnimal {

    @Override
    public void wildSound() {
        System.out.println("Tiger roars");
    }

    @Override
    public void wildColor() {
        System.out.println("Tiger is white");
    }
}

// --------------------
// ABSTRACTION (Abstract Class)
// --------------------
abstract class WildAnimalAbstract {

    void wildSound() {
        System.out.println("Generic wild animal sound");
    }

    void wildColor() {
        System.out.println("Dark green camouflage color");
    }
}

// --------------------
// INHERITANCE
// --------------------
class Lion extends WildAnimalAbstract {

    void name() {
        System.out.println("Name is Jungle Lion");
    }
}

// --------------------
// ENCAPSULATION + BASE CLASS
// --------------------
class DomesticAnimal {

    private String defaultColor = "BLACK"; // Encapsulation (private data)

    void sound() {
        System.out.println("Generic domestic animal sound");
    }

    void color() {
        System.out.println(defaultColor);
    }
}

// --------------------
// POLYMORPHISM (Overriding)
// --------------------
class StreetDog extends DomesticAnimal {

    @Override
    void sound() {
        System.out.println("StreetDog: Bow Bow");
    }
}

class StreetCat extends DomesticAnimal {

    @Override
    void color() {
        System.out.println("StreetCat: Black");
    }
}
