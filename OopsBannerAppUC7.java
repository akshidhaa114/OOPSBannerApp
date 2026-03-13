public class OopsBannerAppUC7 {
    public static void main(String[] args) {
        // Each string array represents 7 lines for that character
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        // Word OOPS -> O, O, P, S
        String[][] word = { O, O, P, S };

        // Print line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int ch = 0; ch < word.length; ch++) {
                line.append(word[ch][row]).append("  "); // 2 spaces between letters
            }
            System.out.println(line.toString());
        }
    }
}git 