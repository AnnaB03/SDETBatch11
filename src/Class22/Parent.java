package Class22;

class Parent {
    final double gravity;

    Parent (double gravity) {
        this.gravity=gravity;
    }

    final void printGravityValue () {
        //gravity = 10.8;
        System.out.println(gravity);
    }
}
class Child extends Parent {
    /*void printGravityValue () {

    }*/ //cannot override a final method
    double gravity = 10.2;
    Child (double gravity) {
        super(gravity);
    }
}

class FinalDemo {

}