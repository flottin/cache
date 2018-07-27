package in.karatube;
import java.util.Map;
import java.util.HashMap;
public class ConsoleColors {
    private static HashMap<String, String> colors;

    public static void getColors(){
        colors = new HashMap<String, String>();

        // Reset
        colors.put("RESET", "\033[0m");  // Text Reset

        // Regular colors
        colors.put("BLACK", "\033[0;30m");   // BLACK
        colors.put("RED", "\033[0;31m");     // RED
        colors.put("GREEN", "\033[0;32m");   // GREEN
        colors.put("YELLOW", "\033[0;33m");  // YELLOW
        colors.put("BLUE", "\033[0;34m");    // BLUE
        colors.put("PURPLE", "\033[0;35m");  // PURPLE
        colors.put("CYAN", "\033[0;36m");    // CYAN
        colors.put("WHITE", "\033[0;37m");   // WHITE

        // Bold
        colors.put("BLACK_BOLD", "\033[1;30m");  // BLACK
        colors.put("RED_BOLD", "\033[1;31m");    // RED
        colors.put("GREEN_BOLD", "\033[1;32m");  // GREEN
        colors.put("YELLOW_BOLD", "\033[1;33m"); // YELLOW
        colors.put("BLUE_BOLD", "\033[1;34m");   // BLUE
        colors.put("PURPLE_BOLD", "\033[1;35m"); // PURPLE
        colors.put("CYAN_BOLD", "\033[1;36m");   // CYAN
        colors.put("WHITE_BOLD", "\033[1;37m");  // WHITE

        // Underline
        colors.put("BLACK_UNDERLINED", "\033[4;30m");  // BLACK
        colors.put("RED_UNDERLINED", "\033[4;31m");    // RED
        colors.put("GREEN_UNDERLINED", "\033[4;32m");  // GREEN
        colors.put("YELLOW_UNDERLINED", "\033[4;33m"); // YELLOW
        colors.put("BLUE_UNDERLINED", "\033[4;34m");   // BLUE
        colors.put("PURPLE_UNDERLINED", "\033[4;35m"); // PURPLE
        colors.put("CYAN_UNDERLINED", "\033[4;36m");   // CYAN
        colors.put("WHITE_UNDERLINED", "\033[4;37m");  // WHITE

        // Background
        colors.put("BLACK_BACKGROUND", "\033[40m");  // BLACK
        colors.put("RED_BACKGROUND", "\033[41m");    // RED
        colors.put("GREEN_BACKGROUND", "\033[42m");  // GREEN
        colors.put("YELLOW_BACKGROUND", "\033[43m"); // YELLOW
        colors.put("BLUE_BACKGROUND", "\033[44m");   // BLUE
        colors.put("PURPLE_BACKGROUND", "\033[45m"); // PURPLE
        colors.put("CYAN_BACKGROUND", "\033[46m");   // CYAN
        colors.put("WHITE_BACKGROUND", "\033[47m");  // WHITE

        // High Intensity
        colors.put("BLACK_BRIGHT", "\033[0;90m");  // BLACK
        colors.put("RED_BRIGHT", "\033[0;91m");    // RED
        colors.put("GREEN_BRIGHT", "\033[0;92m");  // GREEN
        colors.put("YELLOW_BRIGHT", "\033[0;93m"); // YELLOW
        colors.put("BLUE_BRIGHT", "\033[0;94m");   // BLUE
        colors.put("PURPLE_BRIGHT", "\033[0;95m"); // PURPLE
        colors.put("CYAN_BRIGHT", "\033[0;96m");   // CYAN
        colors.put("WHITE_BRIGHT", "\033[0;97m");  // WHITE

        // Bold High Intensity
        colors.put("BLACK_BOLD_BRIGHT", "\033[1;90m"); // BLACK
        colors.put("RED_BOLD_BRIGHT", "\033[1;91m");   // RED
        colors.put("GREEN_BOLD_BRIGHT", "\033[1;92m"); // GREEN
        colors.put("YELLOW_BOLD_BRIGHT", "\033[1;93m");// YELLOW
        colors.put("BLUE_BOLD_BRIGHT", "\033[1;94m");  // BLUE
        colors.put("PURPLE_BOLD_BRIGHT", "\033[1;95m");// PURPLE
        colors.put("CYAN_BOLD_BRIGHT", "\033[1;96m");  // CYAN
        colors.put("WHITE_BOLD_BRIGHT", "\033[1;97m"); // WHITE

        // High Intensity backgrounds
        colors.put("BLACK_BACKGROUND_BRIGHT", "\033[0;100m");// BLACK
        colors.put("RED_BACKGROUND_BRIGHT", "\033[0;101m");// RED
        colors.put("GREEN_BACKGROUND_BRIGHT", "\033[0;102m");// GREEN
        colors.put("YELLOW_BACKGROUND_BRIGHT", "\033[0;103m");// YELLOW
        colors.put("BLUE_BACKGROUND_BRIGHT", "\033[0;104m");// BLUE
        colors.put("PURPLE_BACKGROUND_BRIGHT", "\033[0;105m"); // PURPLE
        colors.put("CYAN_BACKGROUND_BRIGHT", "\033[0;106m");  // CYAN
        colors.put("WHITE_BACKGROUND_BRIGHT", "\033[0;107m");   // WHITE
    }

    public static void display(String msg, String color)
    {
        if (null == colors){
            getColors();
        }
        System.out.println(colors.get(color) + msg + colors.get("RESET"));
    }
}
