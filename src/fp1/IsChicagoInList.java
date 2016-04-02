package fp1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Peter Cappello
 */
public class IsChicagoInList {
    
    public static void main(String[] args) {
        List<String> cities = Arrays.asList(
                "New York",
                "Philadelphia",
                "Los Angeles",
                "Chicago"
        );
        
        // Imperative style: Is Chicago in the list?
        boolean found = false;
        for ( String city : cities ) {
            if ( city.equals( "Chicago" ) ) {
                found = true;
                break;
            }
        }
        System.out.println( "Found Chicago?: " + found );
        
        // Declarative style: Is Chicago in the list?
        System.out.println( "Found Chicago?: " + cities.contains( "Chicago" ) );
    }
}
