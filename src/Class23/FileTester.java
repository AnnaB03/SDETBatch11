package Class23;

public class FileTester<files> {
    public static void main(String[] args) {
        File [] files= {new WordFile(),new PdfFile()};
        for (File f:files) {
            f.open();
            f.edit();
            f.close();
        }
    }

}


