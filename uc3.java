public class uc3 {
    public class OopsBannerAppUC3 {
    public static void main(String[] args) {

        // Each string segment is a single character (either "*" or " ")
        // and we join them with delimiter " " to form one full line.

        // Line 1
        String line1 = String.join(" ",
                " ", "*", "*", "*", "*", "*", " ", " ", " ",      // O
                " ", "*", "*", "*", "*", "*", " ", " ", " ",      // O
                "*", "*", "*", "*", "*", " ", " ", " ", " ",      // P
                " ", "*", "*", "*", "*", "*", " "                 // S
        );

        // Line 2
        String line2 = String.join(" ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", " "
        );

        // Line 3
        String line3 = String.join(" ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", " "
        );

        // Line 4
        String line4 = String.join(" ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", "*", "*", "*", "*", " ", " ", " ", " ",
                " ", "*", "*", "*", "*", "*"
        );

        // Line 5
        String line5 = String.join(" ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", " ", " ", " ", " ",
                " ", " ", " ", " ", " ", "*"
        );

        // Line 6
        String line6 = String.join(" ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", " ", " ", " ", " ",
                " ", " ", " ", " ", " ", "*"
        );

        // Line 7
        String line7 = String.join(" ",
                " ", "*", "*", "*", "*", "*", " ", " ", " ",
                " ", "*", "*", "*", "*", "*", " ", " ", " ",
                "*", " ", " ", " ", " ", " ", " ", " ", " ",
                "*", "*", "*", "*", "*", " "
        );

        // Print all lines
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}
}
