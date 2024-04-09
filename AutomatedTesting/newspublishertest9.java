package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class newspublishertest9 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        java.lang.Class<?> wildcardClass1 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        java.lang.Class<?> wildcardClass3 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass4 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        java.lang.Class<?> wildcardClass4 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass5 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        java.lang.Class<?> wildcardClass4 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass4 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass2 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        java.lang.Class<?> wildcardClass3 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass5 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass4 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver10 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver10);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        login.NewsletterContentObserver newsletterContentObserver19 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver17 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass23 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver2);
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.Class<?> wildcardClass27 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver17);
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver6);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver12);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver8);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver20);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver4 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver4);
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver11 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver11);
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass6 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.Class<?> wildcardClass24 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        login.NewsletterContentObserver newsletterContentObserver8 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver8);
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver14);
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.NewsletterContentObserver.update(String)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        newsletterContentPublisher0.publishNewContent("");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver3);
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver1);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass29 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver7);
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver2 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver2);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        java.lang.Class<?> wildcardClass8 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver9 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver9);
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass10 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.Class<?> wildcardClass14 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        newsletterContentPublisher0.publishNewContent("hi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver19);
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        newsletterContentPublisher0.notifyObservers();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass15 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.Class<?> wildcardClass17 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        login.NewsletterContentObserver newsletterContentObserver13 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver13);
        login.NewsletterContentObserver newsletterContentObserver15 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.publishNewContent("hi!");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.Class<?> wildcardClass19 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Class<?> wildcardClass13 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
            newsletterContentPublisher0.publishNewContent("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        login.NewsletterContentObserver newsletterContentObserver5 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver5);
        login.NewsletterContentObserver newsletterContentObserver7 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver7);
        java.lang.Class<?> wildcardClass9 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        login.NewsletterContentObserver newsletterContentObserver6 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver6);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass11 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.Class<?> wildcardClass21 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.Class<?> wildcardClass20 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.Class<?> wildcardClass16 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass22 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        java.lang.Class<?> wildcardClass7 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("");
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.notifyObservers();
        newsletterContentPublisher0.publishNewContent("hi!");
        newsletterContentPublisher0.publishNewContent("hi!");
        java.lang.Class<?> wildcardClass12 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        java.lang.Class<?> wildcardClass26 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        login.NewsletterContentPublisher newsletterContentPublisher0 = new login.NewsletterContentPublisher();
        login.NewsletterContentObserver newsletterContentObserver1 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver1);
        login.NewsletterContentObserver newsletterContentObserver3 = null;
        newsletterContentPublisher0.unsubscribe(newsletterContentObserver3);
        java.lang.Class<?> wildcardClass5 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.Class<?> wildcardClass25 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        login.NewsletterContentObserver newsletterContentObserver16 = null;
        newsletterContentPublisher0.subscribe(newsletterContentObserver16);
        java.lang.Class<?> wildcardClass18 = newsletterContentPublisher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        newsletterContentPublisher0.subscribe(newsletterContentObserver24);
        // The following exception was thrown during execution in test generation
        try {
            newsletterContentPublisher0.publishNewContent("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

