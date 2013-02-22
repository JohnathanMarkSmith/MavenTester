package MavenTester;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Log log = LogFactory.getLog(App.class.getName());

    public static void main( String[] args )
    {
        log.warn("Starting Batch:");
        System.out.println( "Hello World!" );
    }
}
