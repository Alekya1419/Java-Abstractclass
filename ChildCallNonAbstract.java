// Subclass extending the abstract class
public class ChildCallNonAbstract extends AbstractExample {

    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildCallNonAbstract.");
    }

    public static void main(String[] args) {
  
        ChildCallNonAbstract obj = new ChildCallNonAbstract();

        obj.nonAbstractMethod();
        obj.abstractMethod();
    }
}
