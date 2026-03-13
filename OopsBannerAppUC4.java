public class OopsBannerAppUC4 {
    public static void main(String[] args) {

        // 1. Create a String array to store all seven lines of the OOPS banner
        String[] bannerLines = new String[7];

        // 2. Construct each line using String.join() with individual string segments
        // Each segment is 9 characters wide (including spaces) for alignment

        // Line 0
        bannerLines[0] = String.join("",
                " ***    ",  // O
                " ***    ",  // O
                "*****   ",  // P
                " *****  "   // S
        );

        // Line 1
        bannerLines[1] = String.join("",
                "*   *   ",
                "*   *   ",
                "*   *   ",
                "*    *  "
        );

        // Line 2
        bannerLines[2] = String.join("",
                "*   *   ",
                "*   *   ",
                "*****   ",
                "*    *  "
        );

        // Line 3
        bannerLines[3] = String.join("",
                "*   *   ",
                "*   *   ",
                "*       ",
                " *****  "
        );

        // Line 4
        bannerLines[4] = String.join("",
                "*   *   ",
                "*   *   ",
                "*       ",
                "     *  "
        );

        // Line 5
        bannerLines[5] = String.join("",
                "*   *   ",
                "*   *   ",
                "*       ",
                "*    *  "
        );

        // Line 6
        bannerLines[6] = String.join("",
                " ***    ",
                " ***    ",
                "*       ",
                " *****  "
        );

        // 3. Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}