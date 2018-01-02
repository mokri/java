
"Date" class
 A public class with private attributes (day, month, and year);
 Accessors and mutators to these attributes that will return and modify them;
 Two constructors, the first has (day, month, and year) as parameters, and the second a Date parameter;
 A method is_egale_a (int day, int month, int year) that compares the parameters: day, month and year to the attributes of the calling object by returning a boolean;
 A second method is_egale_a (Date d) that does the same thing with the parameter d;
 A display method () that displays the date as "day / month / year";
 A method day_in_year () that returns the number of the day in the year by inserting the following code:


public int day_in_year () {
// Package of GregorianCalendar and Calendar classes is java.util
GregorianCalendar gc = new GregorianCalendar (year, month-1, day);
gc. setTime (gc.getTime ());
return (gc.get (Calendar.DAY_OF_YEAR));
}


"TestDate" class

 Write the TestDate program that retrieves a date from the arguments of the program start command. (Example: java TestDate 05 02 2002)
 Display this date;
 Display the number of the day in the year; (Example 36 days in the year 2002)