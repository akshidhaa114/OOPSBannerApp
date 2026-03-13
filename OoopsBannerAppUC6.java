public class OoopsBannerAppUC6 {

    public static void main(String[] args) {
        // 7-line banner, each line is a concatenation of O, O, P, S patterns
        String[] bannerLines = {
            getOPattern()[0] + " " + getOPattern()[0] + " " + getPPattern()[0] + " " + getSPattern()[0],
            getOPattern()[1] + " " + getOPattern()[1] + " " + getPPattern()[1] + " " + getSPattern()[1],
            getOPattern()[2] + " " + getOPattern()[2] + " " + getPPattern()[2] + " " + getSPattern()[2],
            getOPattern()[3] + " " + getOPattern()[3] + " " + getPPattern()[3] + " " + getSPattern()[3],
            getOPattern()[4] + " " + getOPattern()[4] + " " + getPPattern()[4] + " " + getSPattern()[4],
            getOPattern()[5] + " " + getOPattern()[5] + " " + getPPattern()[5] + " " + getSPattern()[5],
            getOPattern()[6] + " " + getOPattern()[6] + " " + getPPattern()[6] + " " + getSPattern()[6]
        };

        // Loop-based rendering (enhanced for loop)
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for letter 'O' (7 lines, 9 characters each)
    public static String[] getOPattern() {
        return new String[] {
            String.join("", " ", "*****", "   "),  // adjust spaces to match your UC5 output
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*****", "   ")
        };
    }

    // Helper method for letter 'P' (7 lines, 9 characters each)
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ", "*****", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*   *", "   "),
            String.join("", " ", "*****", "   "),
            String.join("", " ", "*    ", "   "),
            String.join("", " ", "*    ", "   "),
            String.join("", " ", "*    ", "   ")
        };
    }

    // Helper method for letter 'S' (7 lines, 9 characters each)
    public static String[] getSPattern() {
        return new String[] {
            String.join("", " ", " *****", "  "),
            String.join("", " ", "*     ", "  "),
            String.join("", " ", "*     ", "  "),
            String.join("", " ", " *****", "  "),
            String.join("", " ", "     *", "  "),
            String.join("", " ", "     *", "  "),
            String.join("", " ", " *****", "  ")
        };
    }
}