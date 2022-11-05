package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int column = 1; column <= 5; column++) {
            for(int mod = 1; mod <= 5; mod++){
                table += String.format("%3s |",(column * mod));
            }
            table += "\n"
;        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int column = 1; column <= 10; column++) {
            for(int mod = 1; mod <= 10; mod++){
                table += String.format("%3s |",(column * mod));
            }
            table += "\n"
            ;        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int column = 1; column <= tableSize; column++) {
            for(int mod = 1; mod <= tableSize; mod++){
                table += String.format("%3s |",(column * mod));
            }
            table += "\n"
            ;        }
        return table;
    }
}
