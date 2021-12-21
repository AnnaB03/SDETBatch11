package Class23;

abstract public class File {
    /*Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented
method while open is an abstract. Create 3 subclasses:
JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc*/

    void edit () {
        System.out.println("Editing a file");
    }
    void close () {
        System.out.println("Closing a file");
    }
    abstract void open ();
}
class JavaFile extends File {

    @Override
    void open() {
        System.out.println("Use an InteliJ to open this file");
    }
}
class WordFile extends File {

    @Override
    void open() {
        System.out.println("Use Microsoft to open the file");
    }
}
class PdfFile extends File {

    @Override
    void open() {
        System.out.println("Use AdobeReader to open the file");
    }
}
