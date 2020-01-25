package StaticNonstatic;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay Katie= new DriveWay();
        Katie.setDriveWaySize(5);
        System.out.println("Katie's Driveway Size " +Katie.getDriveWaySize());

        DriveWay Mike= new DriveWay();
        Mike.setDriveWaySize(6);
        System.out.println("Mike's Driveway Size " +Mike.getDriveWaySize());
        System.out.println("Katie's Driveway Size " +Katie.getDriveWaySize());

    }
}
