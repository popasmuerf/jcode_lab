package com.packtpub.junit.recap.custom_matchers;


import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/**
 * Created by mdb on 4/9/18.
 *
 * 1. boolean matches(Object obj) is invoked by
 * the assertThat() method
 * 2. public void describeTo method is invoked
 * when the method matches(Object obj) returns
 * false.  this method builds the
 * description of an expections
 *
 * 3. The lessThanOrEqual class
 * needs to compare two objets,
 * so the Matcher class should be
 * operated on the Comparable objects.
 * Create a generic class that operates with any type that
 * implements the Comparable interface as follows
 *
 * public class LessThanOrEqual<T extends Comparable<T>> extends
 * BaseMather<Comparable<T>>{
 *
 * }
 *
 *
 * The following code snippet explais how
 * asseertThat works:
 *
 * if(! matcher.matches(actual)){
 *     Description = new StringDescription();
 *     StringDescription();
 *
 *     description.appendText(reason)
 *     .appendText("\nExpected: )
 *     .appendDescriptionOf(matcher)
 *     .appendText("\n but: ") ;
 *
 *     matcher.describeMismatch(actual,description);
 *
 * }
 *
 * Note :  class GenericClass <T extends U>{....}
 * ^^^ so in Java I can create some guarantees as to the types
 * my generics will work with....interesting.......
 *
 *
 *
 * @Factory annotation isn't necessary but needed for
 * Hamcreat tool.  When we create many custom
 * matchers, then it ecomes annoying
 * to import them all individually.  Hamcrest ships
 * with a :
 *  org.hamcrest.generator.config.XmlConfigurator
 *
 *command-line toolt hat picks up predicates annotated with
 * @Factory annotation and collects them in a
 * Matcher class for easy importing.
 *
 *
 *
 *
 *
 */
public class LessThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>>{
    private final Comparable<T> expectedValue ;
    public LessThanOrEqual(T expectedValue){
        this.expectedValue = expectedValue ;
    }
    @Override
    public boolean matches(Object item) {
        int compareTo = expectedValue.compareTo((T)item);
        boolean flag = compareTo > -1 ;
        return flag;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("less than or equal(<=) " + expectedValue );
    }

    @Factory
    public static <T extends Comparable<T>> Matcher<T> lessThanOrEqual(T type){
        return new LessThanOrEqual(type);
    }

}
