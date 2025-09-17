package Timezone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String input1=sc.nextLine();
        LocalDate date1=LocalDate.parse(input1,formatter);
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String input2=sc.nextLine();
        LocalDate date2=LocalDate.parse(input2,formatter);
        if(date1.isBefore(date2)){
            System.out.println(date1 + " is before "+date2);
        } else if(date1.isAfter(date2)){
            System.out.println(date1 + " is after "+date2);
        } else if(date1.isEqual(date2)){
            System.out.println(date1 + " is the same as "+date2);
        }
    }
}
