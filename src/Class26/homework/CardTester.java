package Class26.homework;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList <Card> linkedList = new LinkedList();
        linkedList.add(new CreditCard("Visa"));
        linkedList.add(new DebitCard("MasterCard"));
        linkedList.add(new PrepaidCard("Prepaid card"));

        for (Card cc:linkedList) {
            cc.issueCard();
            cc.calculateInterest();
        }
    }
}
