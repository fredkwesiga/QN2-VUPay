
package uk.vupay;
import java.util.Scanner;

/**
 *
 * @author fred
 */
import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        // Declare variables
        String moduleCode;
        String moduleName = " ";
        int tuition = 0;

        Scanner input = new Scanner(System.in);

        // allow usser to enter details
        System.out.println("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine();

        moduleCode = moduleCode.toUpperCase();

        if (moduleCode.equals("BSF")) {

            moduleName = "BSc. Software Engineering";
            tuition = 900000;

        } else if (moduleCode.equals("BIT")) {

            moduleName = "BSc. Information Technology";
            tuition = 750000;

        } else if (moduleCode.equals("BCS")) {

            moduleName = "BSc. Computer Science";
            tuition = 800000;

        } else if (moduleCode.equals("BCE")) {

            moduleName = "BSc. Computer Engineering";
            tuition = 950000;

        } else {

            System.out.println("Wrong Module Code details");
            return;
        }

        System.out.println("Course Name: " + moduleName);
        System.out.println("Tuition Fee: UGX " + tuition);
    }
}
