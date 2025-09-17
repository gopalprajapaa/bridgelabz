package Timezone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd):");
        String input=sc.nextLine();
        LocalDate date=LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Original date: "+date);
        LocalDate modifiedDate=date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days,1 month, and 2 years: "+modifiedDate);
        LocalDate finalDate=modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " +finalDate);
    }
}

