package cs_utec.cs2901;

import org.apache.log4j.Logger; // For the updated homework

/* Basic assignment in Java to teach us how to use mvn */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        String washing = "Me lavo las manos por 20 segundos con agua y con jabón"; 
        for (int a = 0; a < 100; a++)
        {
            logger.info(washing); // Some other alternatives include debug, warn, error, and fatal. 
        }
    }
}
