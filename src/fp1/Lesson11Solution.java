package fp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author 
 */
public class Lesson11Solution 
{
  /**
   * Run the exercises to ensure we got the right answers
   */
  public void runExercises() 
  {
    System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
    System.out.println("Running exercise 1 solution...");
    exercise1();
    System.out.println("Running exercise 2 solution...");
    exercise2();
    System.out.println("Running exercise 3 solution...");
    exercise3();
    System.out.println("Running exercise 4 solution...");
    exercise4();
    System.out.println("Running exercise 5 solution...");
    exercise5();
  }

  /**
   * All exercises should be completed using Lambda expressions and the new
   * methods added to JDK 8 where appropriate. There is no need to use an
   * explicit loop in any of the code. Use method references rather than full
   * lambda expressions wherever possible.
   */
  /**
   * Exercise 1
   *
   * Create a string that consists of the first letter of each word in the list
   * of Strings provided.
   */
  private void exercise1() {
    List<String> list = Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    final String firstLetters = list.stream()
            .map( s -> s.charAt( 0 ) )
            .peek( System.out::println )
            .map( s -> s.toString() )
            .peek( System.out::println )
            .collect( Collectors.joining( " ::: " ) );
    System.out.println( "firstLetters: " + firstLetters );
  }

  /**
   * Exercise 2
   *
   * Remove the words that have odd lengths from the list.
   */
  private void exercise2() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    final List<String> evenLengthWords = list.stream()
                                       .filter( s -> s.length() % 2 == 0 )
                                       .collect( Collectors.toList() );
    System.out.println( "evenLengthWords: " + evenLengthWords );
  }

  /**
   * Exercise 3
   *
   * Replace every word in the list with its upper case equivalent.
   */
  private void exercise3() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    final List<String> upperOfList = list.stream()
                                   .map( s -> s.toUpperCase() )
                                   .collect( Collectors.toList() );
    System.out.println( "upperOfList: " + upperOfList );
  }

  /**
   * Exercise 4
   *
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   */
  private void exercise4() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

    final String keyValueString = map.keySet()
            .stream()
            .peek( System.out::println ) 
            .map( s -> s + map.get( s ) )
            .peek( System.out::println )                   // Used for debugging
            .collect( Collectors.joining("") );
    System.out.println( "keyValueString: " + keyValueString );            
  }

  /**
   * Exercise 5
   *
   * Create a new thread that prints the numbers from the list.
   */
  private void exercise5() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//    new Thread( () -> list.forEach( System.out::println ) ).start();
new Thread( () -> System.out.println( "sum: " + list.stream().mapToInt( i -> i ).sum() ) )
        .start(); // forEach( System.out::println ) ).start();
  }

  /**
   * Main entry point for application
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    Lesson11Solution lesson = new Lesson11Solution();
    lesson.runExercises();
  }
}
