package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newspublishertest4 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver31);
        java.lang.Class<?> wildcardClass33 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver31);
        login.NewsletterContentObserver newsletterContentObserver33 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver33);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver31);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
        login.NewsletterContentObserver newsletterContentObserver32 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver32);
        java.lang.Class<?> wildcardClass34 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver30);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver30);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass28 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass28 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver32 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver32);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver31);
        login.NewsletterContentObserver newsletterContentObserver33 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver33);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }
}

