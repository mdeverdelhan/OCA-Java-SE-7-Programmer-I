*Here is the solution of the exercise 9-1.*

In Java, [an assertion is a statement that enables you to test your assumptions about your program](http://docs.oracle.com/javase/1.4.2/docs/guide/lang/assert.html).

Assertions (i.e. `assert` keyword) **should** be used:

* to check something that should never happen (while an exception should be used to check something that might happen)
* for nonpublic [precondition, postcondition and class invariant checking](http://docs.oracle.com/javase/1.4.2/docs/guide/lang/assert.html#usage-conditions)
* essentially for debugging purposes

Assertions **should not** be used:

* to check arguments or parameters of a public method (instead it should be checked by the method itself and an `IllegalArgumentException` or an `IllegalStateException` might be thrown)
* as a replacement of unit testing

Assertions [are disabled by default](http://docs.oracle.com/javase/7/docs/technotes/tools/windows/java.html).

External resources:
* [Where to use Assertion in Java code](http://javarevisited.blogspot.com/2012/01/where-to-use-assertion-in-java-code.html)
* [When to use assertion vs exception](http://stackoverflow.com/questions/1957645/when-to-use-assertion-vs-exception)



