package testcases;

import com.sun.jdi.event.AccessWatchpointEvent;
import org.testng.annotations.Test;

public class HW_6c {

    @Test
    public void taskOne() throws InterruptedException {
/*
        Task 1.  Create if/else conditional statement to print tax % based on the income user enters.

            Tax rate     Tax income
            10%          0 to 10.275
            12%          10.276 to 41.775
            22%          41.776 to 89.075

        condition 1. if user makes from 0 to 10275, print - "your tax will be 10%"

        condition 2. if user makes from 10276 to 41775" , print - "your tax will be12%"

        condition 3. if user makes from 41776 to 89,075" , print - "your tax will be22%"

        condition 3. everything else, print "please call your CPA"
*/

        int taxOne = 10;
        int taxTwo = 12;
        int taxThree = 22;
        int income = 20276;

        if (income <= 10275) {
            System.out.println("Your tax will be " + taxOne + " % ");
        } else if (income >= 10276 && income <= 41775) {
            System.out.println("Your tax will be " + taxTwo + " % ");
        } else if (income >= 41776 && income <= 89075) {
            System.out.println("Your tax will be " + taxThree + " % ");
        } else {
            System.out.println("please call your CPA");
        }

    }

    @Test
    public void taskTwo() {
/*
        Task 2. Create switch statement to print working hours for 6 different departments.

        Start with:

        String department = "sales";
        switch (department){
            case "sales" : System.out.println("Sales depatrment works from 8am to 12pm.");
            case "operations": //// etc.
*/


        String department = "Development";

        switch (department) {
            case "Security":
                System.out.println("Security department works from 00:00 Am to 00:00 Pm.");
                break;
            case "IT":
                System.out.println("IT department works from 10:00 Am to 18:00 Pm.");
                break;
            case "Accounting":
                System.out.println("Accounting department works from 7:00 am to 17:30 Pm.");
                break;
            case "Manufacturing":
                System.out.println("Manufacturing department works from 10:00 Am to 16:00 Pm.");
                break;
            case "Development":
                System.out.println("Development department works from 7:00 Am to 20:00 Pm.");
                break;
            case "CEO":
                System.out.println("CEO works from 12:00 Am to 13:00 Pm.");
                break;


        }


    }
    @Test
    public void taskThree() {
/*
        Task 3. Create for loop to print every second hour in a day (total hours 24, you need to print 12 lines).

        Start with 0 hours,  and complete your loop when day is over.
*/


        for (int i = 0; i < 24; i++) {
            i++;
            System.out.println(i);
            
        }

    }
}


