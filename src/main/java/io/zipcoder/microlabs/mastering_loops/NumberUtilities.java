package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int j = start % 2;
        if (j != 0) ;

        for (int i = start; i < stop; i+=2) {
            result += i;
        }
        return result;
    }



    public static String getOddNumbers(int start, int stop) {
        String result = "";

            for (int i = start; i < stop; i +=2) {
                result += i;
            }
        } return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    //had to change int to stop instead of start
    public static String getRange(int stop)  {
        String result = "";
        for(int i = 0; i < stop; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            result += i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i = start; i < stop; i += step){
            result += i;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
