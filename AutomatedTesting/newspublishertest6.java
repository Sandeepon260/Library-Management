package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newspublishertest6 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        newsletterContentPublisher0.publishNewContent("");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
        java.lang.Class<?> wildcardClass31 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver30);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.lang.Class<?> wildcardClass31 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver31);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        java.lang.Class<?> wildcardClass28 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver29);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

