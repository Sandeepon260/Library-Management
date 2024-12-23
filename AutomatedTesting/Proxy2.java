package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Proxy2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        java.lang.Class<?> wildcardClass10 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.Class<?> wildcardClass16 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        java.lang.Class<?> wildcardClass20 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy29.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
            java.lang.String str18 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        validationProxy19.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass15 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.lang.Class<?> wildcardClass30 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        validationProxy5.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass30 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        validationProxy19.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass12 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.lang.Class<?> wildcardClass19 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy9.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("hi!", "", "");
        java.lang.Class<?> wildcardClass17 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        validationProxy7.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy17.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass15 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass18 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        java.lang.Class<?> wildcardClass10 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy19.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy17.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass29 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.Class<?> wildcardClass19 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.lang.Class<?> wildcardClass19 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.Class<?> wildcardClass23 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass10 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        validationProxy23.register("", "", "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        validationProxy16.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("", "hi!", "");
        java.lang.Class<?> wildcardClass15 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy24.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "", "");
        java.lang.Class<?> wildcardClass20 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy5.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("", "", "");
        java.lang.Class<?> wildcardClass25 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("", "", "hi!");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy5.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.Class<?> wildcardClass33 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass16 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass12 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        validationProxy20.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass25 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.Class<?> wildcardClass26 = validationProxy25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass16 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy12.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        validationProxy14.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        validationProxy23.register("", "hi!", "hi!");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        validationProxy21.register("", "", "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy19.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass25 = validationProxy24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        validationProxy7.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.lang.Class<?> wildcardClass21 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy30.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy17.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
            java.lang.String str21 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "");
        validationProxy5.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.lang.Class<?> wildcardClass20 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        validationProxy15.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass12 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "");
        java.lang.Class<?> wildcardClass11 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("hi!", "hi!", "hi!");
        validationProxy4.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass9 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.Class<?> wildcardClass26 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        validationProxy33.register("hi!", "", "hi!");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "");
        java.lang.Class<?> wildcardClass12 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "");
        java.lang.Class<?> wildcardClass19 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        validationProxy18.register("hi!", "", "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        java.lang.Class<?> wildcardClass18 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        validationProxy15.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.Class<?> wildcardClass13 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass10 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy20.register("", "", "");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        validationProxy21.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy12.register("hi!", "", "");
        java.lang.Class<?> wildcardClass17 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "", "hi!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.Class<?> wildcardClass29 = validationProxy28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = validationProxy4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.lang.Class<?> wildcardClass19 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass9 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass14 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        validationProxy16.register("", "hi!", "");
        validationProxy16.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
            java.lang.String str17 = validationProxy4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        java.lang.Class<?> wildcardClass22 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.lang.Class<?> wildcardClass26 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
            java.lang.String str19 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        validationProxy7.register("", "hi!", "hi!");
        validationProxy7.register("", "", "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass7 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        validationProxy21.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy16.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass16 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass21 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass8 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        validationProxy14.register("", "", "");
        java.lang.Class<?> wildcardClass23 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.Class<?> wildcardClass19 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("", "hi!", "hi!");
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.Class<?> wildcardClass19 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy17.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
            java.lang.String str20 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        java.lang.Class<?> wildcardClass9 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        java.lang.Class<?> wildcardClass25 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
            java.lang.String str29 = validationProxy23.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy12.register("", "hi!", "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.lang.Class<?> wildcardClass28 = validationProxy27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy6.register("", "hi!", "hi!");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        validationProxy13.register("hi!", "", "hi!");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass13 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        validationProxy17.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        validationProxy17.register("", "hi!", "hi!");
        validationProxy17.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.Class<?> wildcardClass16 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        java.lang.Class<?> wildcardClass25 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        validationProxy27.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy27.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        validationProxy26.register("hi!", "", "hi!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        java.lang.Class<?> wildcardClass23 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
            java.lang.String str15 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass9 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        validationProxy11.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass20 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("", "", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "", "");
        java.lang.Class<?> wildcardClass9 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass15 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.Class<?> wildcardClass24 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        validationProxy17.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.Class<?> wildcardClass26 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        validationProxy22.register("", "", "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.lang.Class<?> wildcardClass23 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy30.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass12 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass17 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass7 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "hi!");
        java.lang.Class<?> wildcardClass21 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        validationProxy10.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        validationProxy14.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
        validationProxy9.register("hi!", "", "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.Class<?> wildcardClass22 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy13.register("", "", "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass13 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "", "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.lang.Class<?> wildcardClass34 = validationProxy28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        validationProxy17.register("hi!", "", "");
        java.lang.Class<?> wildcardClass26 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.lang.Class<?> wildcardClass16 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "", "hi!");
        java.lang.Class<?> wildcardClass20 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "hi!", "hi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass15 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.lang.Class<?> wildcardClass31 = validationProxy30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy18.register("hi!", "hi!", "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        java.lang.Class<?> wildcardClass19 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass13 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass24 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = validationProxy6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        validationProxy12.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        validationProxy15.register("", "hi!", "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy20.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.Class<?> wildcardClass34 = validationProxy33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass15 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy22.register("", "hi!", "hi!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        validationProxy6.register("", "hi!", "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass12 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass12 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "", "hi!");
        validationProxy6.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "hi!", "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        validationProxy15.register("hi!", "hi!", "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy8.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        java.lang.Class<?> wildcardClass14 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        validationProxy12.register("hi!", "", "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass22 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy9.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        validationProxy17.register("hi!", "", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass8 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        validationProxy19.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy19);
        validationProxy24.register("", "hi!", "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        validationProxy8.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy6.register("", "", "hi!");
        java.lang.Class<?> wildcardClass11 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        validationProxy9.register("", "hi!", "hi!");
        validationProxy9.register("", "", "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        validationProxy17.register("hi!", "", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        validationProxy18.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy18);
        java.lang.Class<?> wildcardClass24 = validationProxy18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
        java.lang.Class<?> wildcardClass15 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("", "hi!", "hi!");
        validationProxy6.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass18 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        java.lang.Class<?> wildcardClass17 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        validationProxy22.register("hi!", "", "");
        java.lang.Class<?> wildcardClass27 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        validationProxy15.register("", "", "hi!");
        java.lang.Class<?> wildcardClass30 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy11.register("", "", "hi!");
        java.lang.Class<?> wildcardClass16 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        validationProxy15.register("hi!", "hi!", "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy22.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        validationProxy7.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        validationProxy23.register("", "", "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.lang.Class<?> wildcardClass20 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass13 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        validationProxy15.register("", "", "hi!");
        validationProxy15.register("hi!", "", "");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy14.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass24 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass12 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass9 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        validationProxy14.register("hi!", "hi!", "");
        validationProxy14.register("", "hi!", "");
        java.lang.Class<?> wildcardClass36 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        validationProxy22.register("", "", "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        validationProxy20.register("", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        validationProxy22.register("hi!", "", "");
        java.lang.Class<?> wildcardClass27 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass12 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        validationProxy15.register("", "", "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.Class<?> wildcardClass31 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        java.lang.Class<?> wildcardClass17 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy12.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        validationProxy14.register("hi!", "hi!", "");
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = validationProxy14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.Class<?> wildcardClass26 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy5);
        java.lang.Class<?> wildcardClass20 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.lang.Class<?> wildcardClass17 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        validationProxy21.register("", "", "");
        java.lang.Class<?> wildcardClass26 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        validationProxy8.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "");
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        java.lang.Class<?> wildcardClass13 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass17 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("hi!", "", "");
        validationProxy11.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = validationProxy4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = validationProxy6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.lang.Class<?> wildcardClass34 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.lang.Class<?> wildcardClass30 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        validationProxy19.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        validationProxy17.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.Class<?> wildcardClass19 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        validationProxy17.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        validationProxy17.register("", "", "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = validationProxy33.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy22.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass13 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        validationProxy28.register("", "hi!", "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy22);
        java.lang.Class<?> wildcardClass25 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        validationProxy23.register("hi!", "", "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass16 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy14.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        validationProxy15.register("", "hi!", "");
        java.lang.Class<?> wildcardClass30 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass12 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.Class<?> wildcardClass22 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass16 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        validationProxy16.register("hi!", "", "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = validationProxy3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        validationProxy4.register("", "", "");
        java.lang.Class<?> wildcardClass21 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass18 = validationProxy17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass35 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        java.lang.Class<?> wildcardClass6 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass16 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.Class<?> wildcardClass22 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        validationProxy5.register("", "", "");
        validationProxy5.register("hi!", "", "hi!");
        validationProxy5.register("", "hi!", "");
        validationProxy5.register("", "", "hi!");
        validationProxy5.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "hi!", "hi!");
        validationProxy7.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy34.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy7.register("hi!", "", "");
        validationProxy7.register("", "hi!", "hi!");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
            java.lang.String str33 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        validationProxy22.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy28);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.lang.Class<?> wildcardClass16 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.lang.Class<?> wildcardClass30 = validationProxy29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        validationProxy19.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass25 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.Class<?> wildcardClass30 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.Class<?> wildcardClass23 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = validationProxy4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        java.lang.Class<?> wildcardClass13 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass25 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        validationProxy8.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        java.lang.Class<?> wildcardClass21 = validationProxy20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        validationProxy22.register("", "", "hi!");
        validationProxy22.register("", "", "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass16 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.Class<?> wildcardClass28 = validationProxy19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        java.lang.Class<?> wildcardClass18 = validationProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        validationProxy27.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.lang.Class<?> wildcardClass13 = validationProxy11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        validationProxy21.register("", "hi!", "hi!");
        validationProxy21.register("", "hi!", "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy18.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        java.lang.Class<?> wildcardClass34 = validationProxy33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass5 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        validationProxy2.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        validationProxy14.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass32 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass17 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy3);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        validationProxy5.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("", "hi!", "");
        validationProxy15.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass24 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy21.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("", "", "hi!");
        java.lang.Class<?> wildcardClass11 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.Class<?> wildcardClass22 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
            java.lang.String str27 = validationProxy25.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "");
        validationProxy6.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        validationProxy5.register("", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy17.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy24.register("", "hi!", "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        java.lang.Class<?> wildcardClass14 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "hi!", "");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("", "hi!", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("hi!", "hi!", "hi!");
        validationProxy9.register("", "hi!", "");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy8);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        validationProxy17.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass26 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        validationProxy27.register("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = validationProxy27.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy11.register("", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = validationProxy16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.Class<?> wildcardClass24 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy4.register("hi!", "", "hi!");
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
