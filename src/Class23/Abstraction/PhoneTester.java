package Class23.Abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        //Phone phone=new Phone(); can't create the object because its an abstract class

        Iphone iphone=new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.sendText();
        samsung.makePhoneCalls();
        Phone [] phones = {new Iphone(), new Samsung()};
        for (Phone ph:phones
        ) {
            ph.displayPictures();
            ph.makePhoneCalls();
            ph.unlockPhone();
            ph.sendText();
        }

    }
}