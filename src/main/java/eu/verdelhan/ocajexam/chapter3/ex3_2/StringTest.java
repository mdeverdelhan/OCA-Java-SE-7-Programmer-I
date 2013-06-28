package eu.verdelhan.ocajexam.chapter3.ex3_2;

/**
 * Official FindBugs™ website: http://findbugs.sourceforge.net/
 */
public class StringTest {

    public static void main(String[] args) {
        // Fixing the performance bug (found with FindBugs™)
//      String s1 = new String("String one");
        String s1 = "String one";
        
        String s2 = "String two";
        String s3 = "String " + "three";
    }
}
