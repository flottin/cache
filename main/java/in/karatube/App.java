package in.karatube;
import org.apache.commons.cli.*;
import redis.clients.jedis.*;
import java.io.Console;

/**
 * invoking cache
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Options options = new Options();
        options.addOption("c", "cache", true, "cache a key");
        options.addOption("h", "help", true, "help");


        String header = "\nManage redis cache!\n\n";
        String footer = "\nPlease report issues at https://github.com/flottin/cache/issues";

      try {
        CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse( options, args);

            if (null == args || cmd.hasOption("h") == true ){
              HelpFormatter formatter = new HelpFormatter();
              formatter.printHelp("java -jar shape.jar", header, options, footer, true);

            }

            if(cmd.hasOption("c") && cmd.hasOption("m")) {
                cache();
            }
        } catch (Exception e) {

        }
      }

    public static void cache(){
      Cache cache = new Cache();
    	System.out.println("notexists : " + cache.get("notexists"));
    	cache.set("ShapeControl", "a new one");
    	System.out.println(cache.get("ShapeControl"));
    }

}
