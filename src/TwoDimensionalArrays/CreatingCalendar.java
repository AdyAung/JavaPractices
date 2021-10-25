package TwoDimensionalArrays;

public class CreatingCalendar {
    public static void main(String[] args) {
        String[][] calendar = {{"volunteer", "delivery", null, null, "doctor", null, "soccer"},
                                {null, "exam 1", null, "mechanic", null, null, "soccer"},
                                {"volunteer", "off work", null, "birthday", null, "concert", null},
                                {null, "exam 2", null, null, "doctor", null, "soccer"},
                                {"visit family", null, null, null, null, null, null}};

        int numberOfEventsPerWeekDay;
        for(int i = 0; i< calendar.length; i++){
            numberOfEventsPerWeekDay = 0;
            for(int j = 0; j < calendar[i].length; j++){

                String event = calendar[i][j];
                if(event != null && !event.equals(" ")){
                    /*
                    If the  day does not have a null value or empty
                    string for an event, then we print it and count it
                     */

                    System.out.println("Week: " + (i+1) + ", Day: " +
                            (j+1) + ", Event: " + event);
                    numberOfEventsPerWeekDay++;
                }
            } //inner for loop end
            System.out.println("Total number of events for week " + (i+1) +
                    ": " + numberOfEventsPerWeekDay + "\n");

        }

        //Vertical Column
        String[] days = {"Sundays", "Mondays", "Tuesdays", "Wednesdays",
                            "Thursdays", "Fridays", "Saturdays"};
        for(int i = 0; i < calendar[0].length; i++){
            numberOfEventsPerWeekDay = 0;

            for(int j = 0; j < calendar.length; j++){
                String event = calendar[j][i];

                if( event != null && !event.equals(" ")){
                    numberOfEventsPerWeekDay++;
                }
            }// end for loop
            System.out.println("Number of events on " + days[i] +
                    ": " + numberOfEventsPerWeekDay);
        }
    }
}
