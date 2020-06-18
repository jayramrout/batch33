package inheritance;


public class Pet implements Swimming{

    @Override
    public void swim() {
        System.out.println("This pet can swim...");
    }
}
