/*

Your birthday calculator application should do the following:
    Ask someone for their birthday ex: 01/01/2002
    Tell them the day of the week their birthday falls on.
    Then tell them the day of the week it falls on this year!
    Next tell them what day it is today & the number of days until their next birthday...
    And how many years old they will be!

    Packages found on google, not sure if needed:


    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    import java.util.Date;
    import java.util.GregorianCalendar;
*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class BirthCalc {

    public static void main(String[] args)
    {
        String dateBirth = "";
        String currentDate = "";
        String 

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        System.out.println("When is your birthday? (Include year of birth too)");

    }
}

/*
    Output should look like:
    Welcome to the Magical BirthDAY Calculator!

    What's your birthday?
    01-01-2002
    That's means you were born on a TUESDAY!
    This year it falls on a MONDAY...
    And since today is 12-30-2018, there's only 2 more days until the next one!
    Bet yer excited to be turning 17!




*/