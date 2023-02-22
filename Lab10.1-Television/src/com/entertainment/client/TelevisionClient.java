package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {

    // STARTING point for any standalone Java application
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        try {
            // create an instance of Television and set its properties individually
            Television tv1 = new Television();
            tv1.setBrand("Samsung");
            tv1.setVolume(32);  // invalid now
            tv1.setDisplay(DisplayType.OLED);

            // create a 2nd Television object via the brand-volume-display constructor
            Television tv2 = new Television("Sony", 50, DisplayType.PLASMA);

            // NOW, create a 3rd instance, specifying ONLY its brand
            Television tv3 = new Television("LG");

            // turn them all on
            tv1.turnOn();
            tv2.turnOn();
            tv3.turnOn();
            System.out.println();  // blank line in the output

            // turn them all off
            tv1.turnOff();
            tv2.turnOff();
            tv3.turnOff();
            System.out.println();

            // show their toString() methods in action
            System.out.println(tv1.toString());
            System.out.println(tv2);  // toString() automatically called
            System.out.println(tv3);
            System.out.println();
        }
        catch (InvalidBrandException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // just the reason message
        }

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}