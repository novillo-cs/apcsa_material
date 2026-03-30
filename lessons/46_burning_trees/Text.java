public class Text{
    public static final int BRIGHT = 1;
    public static final int DARK = 2;
    public static final int ITALICS = 3;
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;
    public static final String CLEAR_SCREEN =  "\033[2J";
    public static final String HIDE_CURSOR =  "\033[?25l";
    public static final String SHOW_CURSOR =  "\033[?25h";

    //use this to go back to normal terminal colors
    public static final String RESET = color(40,37)+SHOW_CURSOR;

    //use this to convert from color to background (30 to 37 becomes 40 to 47)
    public static int background(int color){
	     return color + 10;
    }

    //terminal specific character to move the cursor to a location
    //top left is 1,1
    public static String go(int x,int y){
        return ("\033[" + x + ";" + y + "H");
    }


    public static String color(int a, int b){
        return ("\033[0;" + a+ ";" + b + "m");
    }
    public static String color(int a){
        return ("\033[0;" + a+ "m");
    }
    public static String color(int a, int b,int c){
        return ("\033[0;" + a+ ";" + b + ";" + c+ "m");
    }
    public static String color(int a, int b,int c, int d){
        return ("\033[0;" + a+ ";" + b + ";" + c + ";" + d + "m");
    }


    //And don't forget you can easily delay the printing if needed:
    public static void wait(int millis){
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
        }
    }


}
