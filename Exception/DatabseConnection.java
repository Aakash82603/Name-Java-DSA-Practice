package Exception;
class Database {
    public void Fetchdata(boolean shouldFail) throws Exception {
        try {
            if (shouldFail) {
                throw new Exception("Data fetch failed");
            } else {
                System.out.println("Data fetched successfully");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing database connection");
        }
    }
}

public class DatabseConnection {
    public static void main(String[] args) {
        Database db = new Database();
        try {
            db.Fetchdata(true);
        } catch (Exception e) {
           // System.out.println(e.getMessage());
        }
        try {
            db.Fetchdata(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

