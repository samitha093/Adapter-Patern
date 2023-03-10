interface Bird
{
    // birds implement Bird interface that allows
    // them to fly and make sounds adaptee interface
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird
{
    // a concrete implementation of bird
    public void fly()
    {
        System.out.println("Flying");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
}

interface ToyDuck
{
    // target interface
    // toyducks dont fly they just make
    // squeaking sound
    public void squeak();
}

class PlasticToyDuck implements ToyDuck
{
    public void squeak()
    {
        System.out.println("Squeak");
    }
}

class BirdAdapter implements ToyDuck
{
    //bird to ToyDuck converter
    Bird bird;
    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }

    public void squeak()
    {
        // translate the methods appropriately
        bird.makeSound();
    }
}

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Bird sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck newobj = new BirdAdapter(new Sparrow());
        newobj.squeak();
    }
}