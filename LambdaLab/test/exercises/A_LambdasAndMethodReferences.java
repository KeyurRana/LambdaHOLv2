package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This set of exercises is about lambdas and method references.
 * You will write a lambda or method reference corresponding to
 * each of several different functional interfaces. Each exercise
 * is named after the functional interface intended to be used
 * as the solution.
 */
public class A_LambdasAndMethodReferences {

    /**
     * Write a lambda expression that is a predicate
     * that tests whether a string is longer than four characters.
     */
    @Test @Ignore
    public void a_predicate1() {
        Predicate<String> pred = null; // TODO

        assertTrue(pred.test("abcde"));
        assertFalse(pred.test("abcd"));
    }

    /**
     * Write a lambda expression that is a predicate
     * that tests whether a string is empty.
     */
    @Test @Ignore
    public void a_predicate2() {
        Predicate<String> pred = null; // TODO

        assertTrue(pred.test(""));
        assertFalse(pred.test("a"));
    }

    /**
     * Write a method reference that is a predicate
     * that tests whether a string is empty.
     */
    @Test @Ignore
    public void a_predicate3() {
        Predicate<String> pred = null; // TODO

        assertTrue(pred.test(""));
        assertFalse(pred.test("a"));
    }

    /**
     * Create a predicate that returns true if both predicates
     * startsWithJ and lengthIs7 hold.
     */
    @Test @Ignore
    public void a_predicate4() {
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        Predicate<String> lengthIs7 = s -> s.length() == 7;

        Predicate<String> startsWithJAndLengthIs7 = null; // TODO

        assertFalse(startsWithJAndLengthIs7.test("Hello"));
        assertFalse(startsWithJAndLengthIs7.test("HelloJ1"));
        assertFalse(startsWithJAndLengthIs7.test("Java1"));
        assertTrue(startsWithJAndLengthIs7.test("JavaOne"));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // see java.util.function.Predicate.and()
    // </editor-fold>

    /**
     * Create a predicate that is true if the length of the provided string
     * is 9 or the provided string equals ERROR.
     */
    @Test @Ignore
    public void a_predicate5() {
        Predicate<String> lengthIs9 = s -> s.length() == 9;
        Predicate<String> equalsError = "ERROR"::equals;

        Predicate<String> lengthIs9orError = null; // TODO

        assertFalse(lengthIs9orError.test("Hello"));
        assertTrue(lengthIs9orError.test("Hello J1!"));
        assertTrue(lengthIs9orError.test("ERROR"));
        assertFalse(lengthIs9orError.test("Error"));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // see java.util.function.Predicate.or()
    // </editor-fold>

    /**
     * Write a lambda expression that wraps the given
     * string in parentheses.
     */
    @Test @Ignore
    public void b_function1() {
        Function<String, String> func = null; // TODO

        assertEquals("(abc)", func.apply("abc"));
    }

    /**
     * Write a lambda expression that converts the
     * given string to upper case.
     */
    @Test @Ignore
    public void b_function2() {
        Function<String, String> func = null; // TODO

        assertEquals("ABC", func.apply("abc"));
    }

    /**
     * Write a method reference that converts the
     * given string to upper case.
     */
    @Test @Ignore
    public void b_function3() {
        Function<String, String> func = null; // TODO

        assertEquals("ABC", func.apply("abc"));
    }

    /**
     * Write a lambda expression that appends the
     * string "abc" to the given StringBuilder.
     */
    @Test @Ignore
    public void c_consumer1() {
        Consumer<StringBuilder> cons = null; // TODO

        StringBuilder sb = new StringBuilder("xyz");
        cons.accept(sb);
        assertEquals("xyzabc", sb.toString());
    }

    /**
     * Write a lambda expression that clears the given list.
     */
    @Test @Ignore
    public void c_consumer2() {
        Consumer<List<String>> cons = null; // TODO

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        cons.accept(list);
        assertTrue(list.isEmpty());
    }

    /**
     * Write a method reference that clears the given list.
     */
    @Test @Ignore
    public void c_consumer3() {
        Consumer<List<String>> cons = null; // TODO

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        cons.accept(list);
        assertTrue(list.isEmpty());
    }

    /**
     * Given two consumers, create a consumer that passes the String to the
     * first consumer, then to the second.
     */
    @Test @Ignore
    public void c_consumer4() {
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = null; // TODO

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        consumer.accept(list);
        assertEquals(Arrays.asList("a", "b", "c", "first", "second"), list);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // see java.util.function.Consumer.andThen()
    // </editor-fold>

    /**
     * Write a lambda expression that returns a new StringBuilder
     * containing the string "abc".
     */
    @Test @Ignore
    public void d_supplier1() {
        Supplier<StringBuilder> sup = null; // TODO

        assertEquals("abc", sup.get().toString());
    }

    /**
     * Write a lambda expression that returns a new, empty StringBuilder.
     */
    @Test @Ignore
    public void d_supplier2() {
        Supplier<StringBuilder> sup = null; // TODO

        assertEquals("", sup.get().toString());
    }

    /**
     * Write a method reference that returns a new, empty StringBuilder.
     */
    @Test @Ignore
    public void d_supplier3() {
        Supplier<StringBuilder> sup = null; // TODO

        assertEquals("", sup.get().toString());
    }

    /**
     * Write a lambda expression that, given two strings, returns the result
     * of concatenating the first with the second, followed by the
     * first again.
     */
    @Test @Ignore
    public void e_bifunction1() {
        BiFunction<String, String, String> bifunc = null; // TODO

        assertEquals("abcdefabc", bifunc.apply("abc", "def"));
    }

    /**
     * Write a lambda expression that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     */
    @Test @Ignore
    public void e_bifunction2() {
        BiFunction<String, String, Integer> bifunc = null; // TODO

        assertEquals((Integer)3, bifunc.apply("abcdefghi", "def"));
        assertEquals((Integer)(-1), bifunc.apply("abcdefghi", "xyz"));
    }

    /**
     * Write a method reference that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     */
    @Test @Ignore
    public void e_bifunction3() {
        BiFunction<String, String, Integer> bifunc = null; // TODO

        assertEquals((Integer)3, bifunc.apply("abcdefghij", "def"));
        assertEquals((Integer)(-1), bifunc.apply("abcdefghij", "xyz"));
    }

    /**
     * Write a lambda expression that appends the 'suffix'
     * variable (a String) to the sb variable (a StringBuilder).
     */
    @Test @Ignore
    public void f_runnable1() {
        StringBuilder sb = new StringBuilder("abc");
        String suffix = "xyz";

        Runnable r = null; // TODO

        r.run();
        r.run();
        r.run();
        assertEquals("abcxyzxyzxyz", sb.toString());
    }

    /**
     * Write a lambda expression that takes a string argument
     * and returns the index of that argument into the string
     * "abcdefghij", or that returns -1 if the string argument
     * doesn't occur.
     */
    @Test @Ignore
    public void g_boundMethodRef1() {
        Function<String, Integer> func = null; // TODO

        assertEquals((Integer)2, func.apply("cde"));
        assertEquals((Integer)4, func.apply("efg"));
        assertEquals((Integer)(-1), func.apply("xyz"));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Call the indexOf() method on a string literal.
    // </editor-fold>

    /**
     * Write a bound method reference that takes a string argument
     * and returns the index of that argument into the string
     * "abcdefghij", or that returns -1 if the string argument
     * doesn't occur.
     */
    @Test @Ignore
    public void g_boundMethodRef2() {
        Function<String, Integer> func = null; // TODO

        assertEquals((Integer)2, func.apply("cde"));
        assertEquals((Integer)4, func.apply("efg"));
        assertEquals((Integer)(-1), func.apply("xyz"));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Place a string literal on the left-hand side of the :: operator.
    // </editor-fold>
}
