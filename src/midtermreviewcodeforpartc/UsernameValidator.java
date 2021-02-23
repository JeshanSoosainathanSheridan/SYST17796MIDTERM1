/*
 * Jeshan Soosainathan
 * Student ID: 991589846
 * SYST10199 - Web Programming
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Jesha
 */
public class UsernameValidator {
    
    
    public static boolean valdiateUsername(String name) {
        boolean result = true;
        
        if (name==null) {
            
            result = false;
            System.err.println("Invalid username " + name + " is empty!");
            
        }
        else {
            
            System.out.println(name + " is a valid username.");
        }
        
       return result; 
    }
    
}
