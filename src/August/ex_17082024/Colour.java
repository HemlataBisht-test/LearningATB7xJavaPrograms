package August.ex_17082024;

public enum Colour {
    RED("FF545"),
    BLUE("FF5445"),
    GREEN("HY67");
    private final String hexValue;
    Colour(String hexValue) {
        this.hexValue =hexValue;
    }
    public String getValue(){
        return hexValue;
    }
}
