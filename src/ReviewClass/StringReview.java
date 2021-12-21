package ReviewClass;

public class StringReview {

    public static void main(String[] args) {

    String str = "Today is Thursday and it is Java review class";
    boolean empty = str.isEmpty();

        System.out.println("My string is empty = " +empty);
        int length = str.length();
        System.out.println("length of the String is "+ length);

        //instead of Thursday I want to have Monday
        str=str.replace("Thursday","Monday"); //reassigning because it is immutable (unchangeable)
        System.out.println(str);
        //to define a Method we must have: returnType and name;
        //Optional: access modifier, non-access modifier (ex.static)

        //how many words does my string have?
        String [] allWords = str.split(" "); //splitting based on the space
        System.out.println("In my string I have "+allWords.length+" words");

        //print all words 1 by 1
        for (String word:allWords) {
            System.out.print(word + ", ");
        }
        System.out.println();
        //how would you reverse a String?
        String give = "Hello";
        StringBuilder sb = new StringBuilder(give); //initialised an object
        sb.reverse();
        System.out.println(sb);

        //how would you reverse a string w/o using reverse (loop+charAt)
        String reverse = "";
        for (int i = give.length()-1; i>=0; i--) {
            reverse += give.charAt(i);
        }
        System.out.println(reverse);

        //substring
        String s = "Today I am happy";
        s=s.substring(6);
        System.out.println(s);
        s = s.substring(0, 4);
        System.out.println(s);


    }
}
