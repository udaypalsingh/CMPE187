/**
 * Program for getting next day's date
 */
public class NextDate {

    //Global variables
    boolean isLeap;
    int month, day, year;

    /**
     *Ctor for NextDay
     * @param date is String in MM/DD/YYYY format
     */
    public NextDate(String date) {
        String[] values = date.split("/");
        this.month = Integer.parseInt(values[0]);
        this.day = Integer.parseInt(values[1]);
        this.year = Integer.parseInt(values[2]);
    }


    /**
     * Gets the next date
     * @return the next day's date in MM/DD/YYYY format
     */
    public String nextDate() {
        int noOfDaysInMonth = 0;

        //if month, day, or year is not within the domain then prints error
        if (month > 12 || month < 1 || day > 31 || day < 1 || year >= 2099 || year <= 1900) {
            return "Invalid Input";
        }

        //Check if the year is a leap year
        if (year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;
                }
            }
            else {
                isLeap = true;
            }
        }

        //gets the days based on the month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            noOfDaysInMonth = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            noOfDaysInMonth = 30;
        }
        else if (isLeap) {
            noOfDaysInMonth = 29;
        }
        else{
            noOfDaysInMonth = 28;
        }

        //gets the next day based on the noOfDaysInMonth
        if (noOfDaysInMonth > day) {
            day++;
        }
        else if (noOfDaysInMonth == day) {
            if (month == 12) {
                month = 1;
                day = 1;
                year = year + 1;
            } else {
                day = 1;
                month = month + 1;
            }
        }
        else{
            return "Invalid Input";
        }
        return (month + "/" + day + "/" + year);
    }


    public static void main(String []args){
        NextDate date = new NextDate("2/28/2016");
        System.out.println(date.nextDate());
    }
}
