package reviewClass10;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase = new GoogleDatabase();
        dataBase.closeDataBase();
        dataBase.openDataBase();
        dataBase.editData();
        dataBase.readData();
    }
}
