public class SpeedConverter {

    public static long toMilesPerHour(double KiloMetersPerHour) {

        if (KiloMetersPerHour < 0) {
            return -1;
        }

      return Math.round(KiloMetersPerHour/1.601);
    }

    public static void printConversion(double KiloMetersPerHour) {

        if(KiloMetersPerHour<0) {
            System.out.println("Invalid value");
        }else {
            long MilesPerHour=toMilesPerHour(KiloMetersPerHour);
            System.out.println(KiloMetersPerHour +" Km/h =" +
                    MilesPerHour + " Mi/h");
        }

    }
}

