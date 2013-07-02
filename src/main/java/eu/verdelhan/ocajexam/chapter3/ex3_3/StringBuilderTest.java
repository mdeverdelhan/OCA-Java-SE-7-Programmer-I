package eu.verdelhan.ocajexam.chapter3.ex3_3;

/**
 * See the documentation of the StringBuilder class:
 * http://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        
        // 1st StringBuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello World!");
        System.out.println("1st string builder\n"
                + "\tcapacity: " + sb1.capacity() + "\n"
                + "\tlength: " + sb1.length() + "\n"
                + "\tcontent: " + sb1.toString());

        // 2nd StringBuilder
        StringBuilder sb2 = new StringBuilder('1');
        sb2.append(':');
        sb2.append(" this is a foo bar");
        System.out.println("2nd string builder\n"
                + "\tcapacity: " + sb2.capacity() + "\n"
                + "\tlength: " + sb2.length() + "\n"
                + "\tcontent: " + sb2.toString());

        // 3rd StringBuilder
        StringBuilder sb3 = new StringBuilder(42);
        sb3.append("");
        System.out.println("3rd string builder\n"
                + "\tcapacity: " + sb3.capacity() + "\n"
                + "\tlength: " + sb3.length() + "\n"
                + "\tcontent: " + sb3.toString());

        // 4th StringBuilder
        StringBuilder sb4 = new StringBuilder("This is a test.");
        sb4.reverse();
        System.out.println("4th string builder\n"
                + "\tcapacity: " + sb4.capacity() + "\n"
                + "\tlength: " + sb4.length() + "\n"
                + "\tcontent: " + sb4.toString());
    }
}