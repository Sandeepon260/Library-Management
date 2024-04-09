package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newspublishertest3 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver31);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver31);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver35 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver35);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
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
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver30 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver30);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        newsletterContentPublisher0.publishNewContent("");
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
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver31);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver34 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver34);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver27);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
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
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver34 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver34);
        login.NewsletterContentObserver newsletterContentObserver36 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver36);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
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
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
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
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.notifyObservers();
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
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass30 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        newsletterContentPublisher0.notifyObservers();
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
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
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
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver28);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        newsletterContentPublisher0.publishNewContent("");
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
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
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
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        newsletterContentPublisher0.publishNewContent("");
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
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver21);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
        login.NewsletterContentObserver newsletterContentObserver29 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver29);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver25);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        login.NewsletterContentObserver newsletterContentObserver23 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver23);
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver10);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver22);
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        login.NewsletterContentObserver newsletterContentObserver22 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver22);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver15);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        login.NewsletterContentObserver newsletterContentObserver25 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver25);
        login.NewsletterContentObserver newsletterContentObserver27 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver27);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        login.NewsletterContentObserver newsletterContentObserver14 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        login.NewsletterContentObserver newsletterContentObserver21 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver21);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        login.NewsletterContentObserver newsletterContentObserver26 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver26);
        login.NewsletterContentObserver newsletterContentObserver28 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver28);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass28 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver19);
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver24 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        login.NewsletterContentObserver newsletterContentObserver31 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver31);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass35 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        login.NewsletterContentObserver newsletterContentObserver12 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver14);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver16);
        login.NewsletterContentObserver newsletterContentObserver18 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver18);
        login.NewsletterContentObserver newsletterContentObserver20 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver20);
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver33 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver33);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }
}

