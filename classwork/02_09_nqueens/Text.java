public class Text{
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";
  // to go back to normal terminal colors
  public static final String RESET = "\033[0m"+SHOW_CURSOR;

  // move the cursor to a location (example: top left is 1, 1)
  public static void go(int x,int y){
     System.out.println("\033[" + x + ";" + y + "H");
  }

  public static void wait(int millis){
    try {
      Thread.sleep(millis);
    }
    catch (InterruptedException e) {
    }
  }
}
