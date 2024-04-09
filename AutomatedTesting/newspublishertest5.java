
package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newspublishertest5 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.Class<?> wildcardClass31 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
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
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        newsletterContentPublisher0.publishNewContent("");
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
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver31);
        login.NewsletterContentObserver newsletterContentObserver33 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver33);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
        java.lang.Class<?> wildcardClass31 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        java.lang.Class<?> wildcardClass29 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass29 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver30);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass29 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
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
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }
}

