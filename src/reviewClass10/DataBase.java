package reviewClass10;

abstract public class DataBase {
    abstract void openDataBase();
    abstract void readData();
    abstract void editData();
    abstract void closeDataBase();

} class mySQLServer extends DataBase {
    @Override
    void openDataBase() {
        System.out.println("Opening data base from Microsoft Database");
    }
    @Override
    void readData() {
        System.out.println("Reading the data from Microsoft Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from Microsoft Database");
    }
    @Override
    void closeDataBase() {
        System.out.println("Closing the data from Microsoft Database");
    }
} class InformixDataBase extends DataBase {
    @Override
    void openDataBase() {
        System.out.println("Opening data base from IBM Database");
    }
    @Override
    void readData() {
        System.out.println("Reading the data from IBM Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from IBM Database");
    }
    @Override
    void closeDataBase() {
        System.out.println("Closing the data from IBM Database");
    }
}
class GoogleDatabase extends DataBase {
    @Override
    void openDataBase() {
        System.out.println("Opening data base from Google Database");
    }
    @Override
    void readData() {
        System.out.println("Reading the data from Google  Database ");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from Google Database ");
    }
    @Override
    void closeDataBase() {
        System.out.println("Closing the data from Google Database ");
    }
}

