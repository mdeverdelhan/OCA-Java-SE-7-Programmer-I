package eu.verdelhan.ocajexam.chapter3.ex3_4;

/**
 * See the documentation of the compareTo(String anotherString) method of the String class:
 * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
 */
public class StringComparison {

    public static void main(String[] args) {
        
        String eggs1 = "Cackle fruit";
        String eggs2 = "Cackle fruit";
        System.out.println(eggs1.compareTo(eggs2));
        // 0 is printed because eggs1.equals(eggs2).

        eggs1 = "A fruit";
        eggs2 = "The fruit";
        System.out.println(eggs1.compareTo(eggs2));
        // A negative integer is printed because eggs1 lexicographically precedes eggs2.

        eggs1 = "Your fruit";
        eggs2 = "My fruit";
        System.out.println(eggs1.compareTo(eggs2));
        // A positive integer is printed because eggs1 lexicographically follows eggs2.
    }

}
