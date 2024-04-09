package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Proxy5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("hi!", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        java.lang.Class<?> wildcardClass24 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("", "hi!", "");
        validationProxy17.register("", "", "hi!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy26);
        validationProxy32.register("", "", "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("", "", "");
        java.lang.Class<?> wildcardClass17 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass21 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "", "");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        validationProxy28.register("", "", "");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy28);
        validationProxy28.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy39 = new login.ValidationProxy((login.Client) validationProxy28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = validationProxy28.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass22 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("", "hi!", "hi!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass21 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass11 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass13 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass17 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "hi!", "");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("hi!", "", "hi!");
        validationProxy20.register("", "", "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("hi!", "", "hi!");
        validationProxy13.register("hi!", "hi!", "");
        validationProxy13.register("hi!", "", "");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy22.register("hi!", "", "hi!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy30.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy12.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("", "hi!", "");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = validationProxy29.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
        validationProxy5.register("", "hi!", "hi!");
        validationProxy5.register("hi!", "", "");
        validationProxy5.register("hi!", "hi!", "");
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy31.register("", "", "hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy19.register("hi!", "hi!", "hi!");
        validationProxy19.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy30);
        validationProxy31.register("", "", "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass29 = validationProxy28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy19.register("", "", "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("", "", "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
        validationProxy5.register("", "hi!", "hi!");
        validationProxy5.register("hi!", "", "");
        validationProxy5.register("hi!", "hi!", "");
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy31.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass14 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        java.lang.Class<?> wildcardClass19 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        validationProxy4.register("", "", "");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy4);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy12.register("hi!", "", "");
        validationProxy12.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass14 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "");
        validationProxy4.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy11.register("", "hi!", "");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("", "", "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass11 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy33);
        java.lang.Class<?> wildcardClass35 = validationProxy34.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy32);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy33);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy34);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = validationProxy34.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy21.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "hi!", "hi!");
        validationProxy17.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "hi!", "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy17.register("", "", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy4);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "hi!");
        java.lang.Class<?> wildcardClass26 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass19 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass28 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy14.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        validationProxy26.register("", "hi!", "");
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("", "", "hi!");
        java.lang.Class<?> wildcardClass12 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("", "hi!", "");
        java.lang.Class<?> wildcardClass28 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy19.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy24.register("hi!", "hi!", "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy22.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy10.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("", "hi!", "");
        java.lang.Class<?> wildcardClass32 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy20.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy20.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass17 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        validationProxy2.register("", "", "hi!");
        java.lang.Class<?> wildcardClass26 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("hi!", "", "hi!");
        validationProxy4.register("", "hi!", "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass30 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy6.register("", "hi!", "");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("hi!", "", "");
        validationProxy17.register("", "", "hi!");
        java.lang.Class<?> wildcardClass26 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        java.lang.Class<?> wildcardClass25 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass20 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy8.register("hi!", "", "hi!");
        validationProxy8.register("", "hi!", "hi!");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy23.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("hi!", "hi!", "");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "hi!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass30 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy24.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "hi!", "");
        validationProxy16.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        java.lang.Class<?> wildcardClass16 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass17 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy18);
        java.lang.Class<?> wildcardClass25 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy28.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy14.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        validationProxy29.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "hi!", "hi!");
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass13 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass25 = validationProxy24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy14.register("", "", "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy4.register("", "", "");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "hi!");
        validationProxy6.register("", "", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy25.register("", "", "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass9 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass19 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy33.register("hi!", "", "");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy12.register("", "", "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy31.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass10 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "");
        validationProxy17.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy27);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy9.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy18.register("", "", "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass10 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        validationProxy22.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy32);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy33);
        java.lang.Class<?> wildcardClass35 = validationProxy33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "");
        java.lang.Class<?> wildcardClass25 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy9.register("", "", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy17.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy25.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy25);
        java.lang.Class<?> wildcardClass27 = validationProxy25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy22.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy28.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy29.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy29);
        java.lang.Class<?> wildcardClass35 = validationProxy34.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("hi!", "", "");
        validationProxy5.register("", "", "");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        validationProxy22.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("hi!", "", "");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "");
        validationProxy17.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy12);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("", "hi!", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy21);
        java.lang.Class<?> wildcardClass28 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy19.register("", "", "");
        java.lang.Class<?> wildcardClass24 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass17 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy14.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy18.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy11);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("hi!", "hi!", "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("hi!", "", "hi!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy20.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy16.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy19.register("", "", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        java.lang.Class<?> wildcardClass20 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy18);
        java.lang.Class<?> wildcardClass22 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        validationProxy16.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy25.register("hi!", "", "hi!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy30);
        validationProxy30.register("hi!", "", "");
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy30);
        java.lang.Class<?> wildcardClass37 = validationProxy36.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "", "");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "hi!", "hi!");
        validationProxy16.register("hi!", "", "hi!");
        validationProxy16.register("hi!", "", "");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "", "");
        validationProxy14.register("", "", "hi!");
        validationProxy14.register("hi!", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy20.register("hi!", "hi!", "hi!");
        validationProxy20.register("", "hi!", "hi!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "", "");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass12 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("hi!", "", "hi!");
        validationProxy20.register("hi!", "hi!", "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
        java.lang.Class<?> wildcardClass26 = validationProxy24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy8.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "", "");
        validationProxy9.register("", "hi!", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("", "hi!", "hi!");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy30.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        validationProxy6.register("", "hi!", "");
        validationProxy6.register("", "hi!", "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass24 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy23.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy6.register("", "", "hi!");
        validationProxy6.register("", "", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass16 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        java.lang.Class<?> wildcardClass21 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass12 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("", "hi!", "");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "hi!", "hi!");
        validationProxy16.register("hi!", "", "hi!");
        validationProxy16.register("", "hi!", "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        validationProxy11.register("", "hi!", "");
        validationProxy11.register("", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "hi!", "");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("", "", "");
        validationProxy11.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("", "", "");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("", "", "hi!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "hi!", "");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "", "hi!");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "hi!", "");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy15.register("", "hi!", "");
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy25.register("hi!", "", "hi!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass11 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy19.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        validationProxy10.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy21.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy21);
        java.lang.Class<?> wildcardClass27 = validationProxy26.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy14.register("", "", "");
        java.lang.Class<?> wildcardClass19 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        java.lang.Class<?> wildcardClass24 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        java.lang.Class<?> wildcardClass18 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass19 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy19.register("hi!", "hi!", "");
        validationProxy19.register("", "hi!", "");
        validationProxy19.register("hi!", "", "");
        java.lang.Class<?> wildcardClass32 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "", "");
        java.lang.Class<?> wildcardClass29 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        java.lang.Class<?> wildcardClass19 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass8 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy13.register("hi!", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        java.lang.Class<?> wildcardClass19 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("hi!", "", "hi!");
        validationProxy21.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass31 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy9.register("hi!", "hi!", "hi!");
        validationProxy9.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        java.lang.Class<?> wildcardClass16 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("", "", "hi!");
        java.lang.Class<?> wildcardClass27 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy29.register("hi!", "", "");
        java.lang.Class<?> wildcardClass34 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "", "");
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy34.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy6.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass12 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "", "hi!");
        validationProxy15.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy7);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy25.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy25);
        validationProxy25.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy25);
        validationProxy35.register("", "", "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy16.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy20.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy20.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy16.register("", "", "");
        java.lang.Class<?> wildcardClass21 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass11 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        java.lang.Class<?> wildcardClass19 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("hi!", "hi!", "");
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy7);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "", "hi!");
        validationProxy6.register("hi!", "hi!", "");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        java.lang.Class<?> wildcardClass25 = validationProxy24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy27);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy29.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy29);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy34);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = validationProxy34.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "", "");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "hi!", "");
        validationProxy9.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        java.lang.Class<?> wildcardClass18 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        validationProxy22.register("hi!", "", "");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass15 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        java.lang.Class<?> wildcardClass30 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy21.register("", "hi!", "hi!");
        validationProxy21.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy29.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy29);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy34);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy34);
        validationProxy34.register("", "", "hi!");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = validationProxy31.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy27);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "", "hi!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy14);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("hi!", "hi!", "hi!");
        validationProxy15.register("", "hi!", "hi!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("hi!", "", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "", "");
        validationProxy5.register("", "hi!", "hi!");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy27.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "hi!", "");
        validationProxy15.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        validationProxy17.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy21.register("", "", "");
        validationProxy21.register("hi!", "hi!", "hi!");
        validationProxy21.register("hi!", "", "");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy35.register("", "hi!", "");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "", "");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass14 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        java.lang.Class<?> wildcardClass24 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
        java.lang.Class<?> wildcardClass31 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "hi!");
        validationProxy10.register("", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy10);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy12.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "", "");
        validationProxy17.register("", "hi!", "hi!");
        validationProxy17.register("", "hi!", "hi!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy19.register("", "hi!", "");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("", "", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy28.register("", "", "hi!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
        validationProxy5.register("", "hi!", "hi!");
        validationProxy5.register("hi!", "", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy5);
        java.lang.Class<?> wildcardClass24 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy26.register("hi!", "hi!", "");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy21.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy21);
        java.lang.Class<?> wildcardClass27 = validationProxy26.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy12.register("", "", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("hi!", "hi!", "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("hi!", "hi!", "");
        validationProxy26.register("", "hi!", "");
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy26);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass19 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "", "");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy16.register("", "", "");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy26.register("hi!", "", "");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        validationProxy31.register("", "hi!", "hi!");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy28.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "", "hi!");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy18.register("", "hi!", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy24.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy24.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy12.register("hi!", "hi!", "");
        validationProxy12.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass21 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "hi!");
        validationProxy14.register("", "", "");
        validationProxy14.register("", "", "");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "hi!", "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy22.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
        validationProxy28.register("", "", "");
        validationProxy28.register("", "hi!", "");
        validationProxy28.register("hi!", "", "hi!");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("hi!", "hi!", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "", "hi!");
        validationProxy7.register("", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("", "", "");
        java.lang.Class<?> wildcardClass35 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy7.register("", "hi!", "hi!");
        validationProxy7.register("", "hi!", "hi!");
        validationProxy7.register("", "", "hi!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy19.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy16.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "", "");
        validationProxy14.register("", "", "hi!");
        validationProxy14.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy27.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy20.register("hi!", "hi!", "hi!");
        validationProxy20.register("", "hi!", "");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "");
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy26.register("", "", "hi!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy18.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy14.register("hi!", "hi!", "");
        validationProxy14.register("hi!", "hi!", "");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy21.register("", "hi!", "");
        validationProxy21.register("", "hi!", "");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy10.register("hi!", "", "");
        validationProxy10.register("hi!", "hi!", "");
        validationProxy10.register("", "hi!", "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass15 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy19.register("hi!", "", "hi!");
        validationProxy19.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy22.register("hi!", "hi!", "");
        validationProxy22.register("", "", "");
        validationProxy22.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy22);
        java.lang.Class<?> wildcardClass36 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy21);
        java.lang.Class<?> wildcardClass28 = validationProxy27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy16.register("", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy9.register("", "hi!", "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "");
        validationProxy4.register("hi!", "", "hi!");
        validationProxy4.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy19.register("", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy5);
        java.lang.Class<?> wildcardClass33 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy26.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy31);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy32);
        validationProxy32.register("", "hi!", "");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy10.register("hi!", "hi!", "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy20.register("", "hi!", "");
        validationProxy20.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy8.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        validationProxy13.register("", "", "");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "", "hi!");
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy34.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass39 = validationProxy34.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy23.register("hi!", "", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy19.register("", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        java.lang.Class<?> wildcardClass25 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "hi!");
        java.lang.Class<?> wildcardClass10 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass17 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy29);
        validationProxy29.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy29.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy5);
        java.lang.Class<?> wildcardClass14 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("hi!", "", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy28.register("hi!", "", "hi!");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass19 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("hi!", "", "");
        validationProxy17.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy25.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy6.register("", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass14 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "hi!", "");
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy32.register("hi!", "", "");
        java.lang.Class<?> wildcardClass37 = validationProxy32.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy22.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        java.lang.Class<?> wildcardClass10 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        validationProxy17.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy23);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "", "");
        java.lang.Class<?> wildcardClass29 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "");
        validationProxy9.register("", "hi!", "");
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy21.register("", "", "");
        validationProxy21.register("hi!", "hi!", "hi!");
        validationProxy21.register("hi!", "", "");
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = validationProxy21.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "hi!");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("hi!", "", "");
        validationProxy17.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy26.register("hi!", "", "hi!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy8.register("hi!", "hi!", "");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy25);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy25);
        validationProxy27.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy27);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy32);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy33);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy33);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy33);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy19.register("hi!", "", "hi!");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "hi!");
        validationProxy3.register("", "hi!", "");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy7.register("hi!", "", "hi!");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy18.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy25);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy25);
        validationProxy25.register("", "", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy25);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = validationProxy33.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("hi!", "hi!", "hi!");
        validationProxy9.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy10);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass18 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy13);
        java.lang.Class<?> wildcardClass24 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy12.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("", "", "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "", "");
        validationProxy17.register("", "", "hi!");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy8.register("hi!", "", "");
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("", "", "");
        java.lang.Class<?> wildcardClass24 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy14.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("", "", "hi!");
        validationProxy3.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "");
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy16.register("", "", "");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        java.lang.Class<?> wildcardClass14 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy21.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy21.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass19 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        validationProxy6.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "hi!", "hi!");
        validationProxy22.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy22);
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy32);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy34.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        validationProxy9.register("", "", "");
        java.lang.Class<?> wildcardClass14 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy22.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy27.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass6 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "hi!", "");
        validationProxy9.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass20 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy15.register("hi!", "", "");
        validationProxy15.register("hi!", "", "hi!");
        validationProxy15.register("", "hi!", "");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy34 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy35 = new login.ValidationProxy((login.Client) validationProxy34);
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = validationProxy36.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy4);
    }
}

