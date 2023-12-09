public class Main_5{
    public static void main(String[] args) {
        // Iterate through the custom enum and display RGB values for each color
        for (CustomColor color : CustomColor.values()) {
            color.displayRGB();
        }
    }
}
