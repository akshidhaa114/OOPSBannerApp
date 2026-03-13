public class OopsBannerAppUC5 {
    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("",
                " ***  ",  // O
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
            ),
            String.join("",
                " ***  ",  // O
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
            ),
            String.join("",
                "***** ",  // P
                "*   * ",
                "*   * ",
                "***** ",
                "*     ",
                "*     ",
                "*     "
            ),
            String.join("",
                "***** ",  // S
                "*     ",
                "*     ",
                " ***  ",
                "    * ",
                "    * ",
                "***** "
            )
        };

        // 7-line banner: print line by line using for-each
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (String chPattern : bannerLines) {
                line.append(chPattern.substring(row * 6, row * 6 + 6));
            }
            System.out.println(line.toString());
        }
    }
}