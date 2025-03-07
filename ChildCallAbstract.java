class ChildCallAbstract extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in ChildCallAbstract.");
    }

    public static void main(String[] args) {
        ChildCallAbstract obj = new ChildCallAbstract();
        obj.abstractMethod();
    }
}
