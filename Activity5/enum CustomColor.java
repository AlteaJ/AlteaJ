enum CustomColor {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    CYAN(0, 255, 255),
    MAGENTA(255, 0, 255);

    // RGB values for each color
    private int red;
    private int green;
    private int blue;

    // Constructor for each color
    CustomColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public void displayRGB() {
        System.out.println(this.name() + " - Red: " + red + ", Green: " + green + ", Blue: " + blue);
    }
}