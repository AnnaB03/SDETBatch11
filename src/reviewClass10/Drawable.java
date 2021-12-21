package reviewClass10;

public interface Drawable {
    //final void draw (); we cant use final with interface
    //private void draw(); we can have only public
    //static void draw(); static is not allowed
    //int paperSize; cant leave fields as un-initialized because fields are final
    //private int paperSize = 12; private and protected access modifiers are not allowed
    int paperSize = 12; //interface fields are public static final by default
    void draw();
} class Rectangle implements Drawable {

    @Override
    public void draw() {

    }
}
