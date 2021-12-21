package Class26.homework;

public abstract class Card {
    /*Create a Card class that will have implemented
and unimplemented methods and a constructor
that  will  initializes  credit  card  type.    Create  3
subclasses  of  a  Card  card.  Create  3  objects  of
different  card  and  store  them  into  LinkedList.
Using  for  loop/advanced  for  loop/  iterator
access all methods of the class.*/
    String cardType;
    public abstract void calculateInterest ();
    public void issueCard() {
        System.out.println(cardType+" "+ "issued");
    }
    public Card(String cardType) {
        this.cardType = cardType;
    }
} class CreditCard extends Card {
 public CreditCard (String cardType) {
     super(cardType);
 }
    @Override
    public void calculateInterest() {
        System.out.println("Interest is 10%");
    }
} class DebitCard extends Card {
    public DebitCard (String cardType) {
        super(cardType);
    }
    @Override
    public void calculateInterest() {
        System.out.println("Interest is 0%");
    }
} class PrepaidCard extends Card {
    public PrepaidCard (String cardType) {
        super(cardType);
    }
    @Override
    public void calculateInterest() {
        System.out.println("Must be payed beforehand");
    }}
