package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Proxy8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        validationProxy25.register("", "", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy25);
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy30);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        java.lang.Class<?> wildcardClass37 = validationProxy36.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
            java.lang.String str32 = validationProxy30.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = validationProxy4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
            java.lang.String str16 = validationProxy4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        validationProxy16.register("hi!", "hi!", "hi!");
        validationProxy16.register("", "", "");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy18.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        validationProxy29.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy38 = new login.ValidationProxy((login.Client) validationProxy29);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        validationProxy8.register("", "", "");
        java.lang.Class<?> wildcardClass23 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        validationProxy29.register("hi!", "hi!", "hi!");
        validationProxy29.register("hi!", "", "");
        login.ValidationProxy validationProxy42 = new login.ValidationProxy((login.Client) validationProxy29);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        validationProxy10.register("hi!", "hi!", "");
        validationProxy10.register("", "", "hi!");
        validationProxy10.register("", "", "");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy21.register("", "", "");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy21);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "", "hi!");
        validationProxy3.register("", "hi!", "hi!");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy20.register("", "hi!", "hi!");
        validationProxy20.register("", "hi!", "hi!");
        validationProxy20.register("", "hi!", "hi!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy19.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy7.register("hi!", "", "hi!");
        validationProxy7.register("hi!", "", "");
        java.lang.Class<?> wildcardClass16 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = validationProxy6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy8.register("", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        java.lang.Class<?> wildcardClass14 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        validationProxy12.register("", "", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy12);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy30.register("", "", "hi!");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = validationProxy32.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy12.register("hi!", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy17.register("", "", "");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        java.lang.Class<?> wildcardClass13 = validationProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = validationProxy4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy9);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass25 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        validationProxy13.register("hi!", "hi!", "hi!");
        validationProxy13.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy5.register("hi!", "", "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass37 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        validationProxy16.register("hi!", "hi!", "");
        validationProxy16.register("hi!", "", "hi!");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("", "hi!", "hi!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        validationProxy23.register("", "", "hi!");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = validationProxy18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        validationProxy29.register("hi!", "hi!", "");
        validationProxy29.register("", "hi!", "hi!");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        validationProxy10.register("", "", "");
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy10);
        java.lang.Class<?> wildcardClass20 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "", "hi!");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        validationProxy22.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy16.register("hi!", "", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy16);
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        java.lang.Class<?> wildcardClass18 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("", "hi!", "hi!");
        validationProxy11.register("", "", "hi!");
        validationProxy11.register("", "", "hi!");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "hi!", "");
        validationProxy14.register("", "", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy14.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        validationProxy22.register("", "", "hi!");
        validationProxy22.register("hi!", "hi!", "");
        validationProxy22.register("", "", "");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass12 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("hi!", "", "");
        validationProxy16.register("", "hi!", "");
        java.lang.Class<?> wildcardClass25 = validationProxy16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy21);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        validationProxy20.register("", "", "hi!");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
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
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy5.register("", "", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        validationProxy10.register("hi!", "", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy10.register("", "hi!", "hi!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "", "");
        java.lang.Class<?> wildcardClass26 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
            java.lang.String str25 = validationProxy22.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        validationProxy17.register("hi!", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy13);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        validationProxy11.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = validationProxy34.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        validationProxy10.register("hi!", "hi!", "");
        validationProxy10.register("", "", "hi!");
        validationProxy10.register("hi!", "", "hi!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy30.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "", "hi!");
        validationProxy3.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = validationProxy3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
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
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = validationProxy24.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        login.ValidationProxy validationProxy29 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy29.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy10.register("", "hi!", "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "");
        java.lang.Class<?> wildcardClass21 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy12.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "");
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        validationProxy16.register("hi!", "hi!", "");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
        java.lang.Class<?> wildcardClass26 = validationProxy25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        validationProxy15.register("", "", "");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy17.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
            java.lang.String str15 = validationProxy13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.Class<?> wildcardClass22 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        validationProxy15.register("", "hi!", "hi!");
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy15);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy26);
        validationProxy26.register("", "", "hi!");
        login.ValidationProxy validationProxy32 = new login.ValidationProxy((login.Client) validationProxy26);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        validationProxy2.register("", "", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy16.register("", "", "");
        validationProxy16.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy16);
        validationProxy26.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        java.lang.Class<?> wildcardClass10 = validationProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy16);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy17);
        validationProxy17.register("", "hi!", "");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy3.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy13.register("", "hi!", "hi!");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy9.register("", "", "");
        validationProxy9.register("hi!", "", "");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
            java.lang.String str22 = validationProxy20.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy12.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = validationProxy12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        validationProxy14.register("", "", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy23.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy10.register("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = validationProxy10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        validationProxy2.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy11.register("hi!", "hi!", "");
        validationProxy11.register("", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy11);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy11.register("hi!", "", "hi!");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        java.lang.Class<?> wildcardClass10 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        validationProxy18.register("", "", "");
        validationProxy18.register("hi!", "", "");
        validationProxy18.register("", "", "hi!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        validationProxy9.register("hi!", "", "hi!");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        validationProxy25.register("hi!", "", "hi!");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        validationProxy17.register("hi!", "hi!", "hi!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        login.ValidationProxy validationProxy36 = new login.ValidationProxy((login.Client) validationProxy21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = validationProxy36.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("", "hi!", "hi!");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        validationProxy13.register("", "", "hi!");
        validationProxy13.register("hi!", "", "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("", "hi!", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        validationProxy15.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        validationProxy23.register("", "hi!", "hi!");
        validationProxy23.register("hi!", "hi!", "");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "hi!");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        login.ValidationProxy validationProxy37 = new login.ValidationProxy((login.Client) validationProxy34);
        validationProxy34.register("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = validationProxy34.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "hi!", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy27 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy24.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy5.register("hi!", "hi!", "hi!");
        validationProxy5.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy5);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy5);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy7);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass15 = validationProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        validationProxy19.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy19.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy9.register("", "", "hi!");
        validationProxy9.register("", "", "");
        java.lang.Class<?> wildcardClass18 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = validationProxy26.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy19);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy20.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy26.register("", "hi!", "hi!");
        validationProxy26.register("", "hi!", "");
        validationProxy26.register("", "hi!", "");
        login.ValidationProxy validationProxy39 = new login.ValidationProxy((login.Client) validationProxy26);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy7);
        validationProxy7.register("", "", "");
        validationProxy7.register("", "hi!", "");
        validationProxy7.register("", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy15.register("", "hi!", "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        validationProxy22.register("", "", "hi!");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy23);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
        validationProxy25.register("", "", "");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy21.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy20.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy30 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy19 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        validationProxy20.register("hi!", "hi!", "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = validationProxy20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = validationProxy25.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass9 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.Class<?> wildcardClass23 = validationProxy21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy10.register("", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy10);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("", "", "hi!");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy7.register("hi!", "hi!", "");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
            java.lang.String str18 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = validationProxy2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = validationProxy4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy18);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        validationProxy1.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy21);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy8);
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy9);
        java.lang.Class<?> wildcardClass11 = validationProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        validationProxy15.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = validationProxy15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
        validationProxy24.register("", "hi!", "");
        validationProxy24.register("", "", "");
        validationProxy24.register("", "hi!", "");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "");
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy15.register("", "", "");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy20 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy13);
        validationProxy13.register("", "", "hi!");
        java.lang.Class<?> wildcardClass19 = validationProxy13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        java.lang.Class<?> wildcardClass5 = validationProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy6.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        java.lang.Class<?> wildcardClass36 = validationProxy35.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("", "hi!", "");
        validationProxy2.register("", "", "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "hi!", "hi!");
        validationProxy4.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy4);
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
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy3.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy9 = new login.ValidationProxy((login.Client) validationProxy3);
        validationProxy9.register("", "", "");
        validationProxy9.register("hi!", "", "hi!");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        validationProxy16.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = validationProxy16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy18);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        login.ValidationProxy validationProxy21 = new login.ValidationProxy((login.Client) validationProxy20);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy24.register("", "hi!", "hi!");
        validationProxy24.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy33 = new login.ValidationProxy((login.Client) validationProxy24);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        validationProxy15.register("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = validationProxy15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        validationProxy26.register("", "", "hi!");
        login.ValidationProxy validationProxy31 = new login.ValidationProxy((login.Client) validationProxy26);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy23);
        java.lang.Class<?> wildcardClass27 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        validationProxy22.register("", "", "hi!");
        validationProxy22.register("hi!", "hi!", "");
        validationProxy22.register("", "", "hi!");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        validationProxy16.register("", "", "hi!");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        validationProxy15.register("hi!", "hi!", "");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("hi!", "", "");
        validationProxy4.register("", "", "hi!");
        validationProxy4.register("", "", "hi!");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        login.ValidationProxy validationProxy24 = new login.ValidationProxy((login.Client) validationProxy15);
        login.ValidationProxy validationProxy25 = new login.ValidationProxy((login.Client) validationProxy24);
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy24);
        java.lang.Class<?> wildcardClass27 = validationProxy24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = validationProxy1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        validationProxy7.register("", "", "");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy2.register("hi!", "", "");
        validationProxy2.register("", "", "");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy2);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("hi!", "hi!", "");
        validationProxy1.register("", "hi!", "hi!");
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy22);
        validationProxy22.register("", "", "hi!");
        login.ValidationProxy validationProxy28 = new login.ValidationProxy((login.Client) validationProxy22);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy15 = new login.ValidationProxy((login.Client) validationProxy14);
        java.lang.Class<?> wildcardClass16 = validationProxy14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        login.ValidationProxy validationProxy26 = new login.ValidationProxy((login.Client) validationProxy16);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        validationProxy1.register("", "", "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        validationProxy2.register("hi!", "hi!", "hi!");
        validationProxy2.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = validationProxy12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "", "hi!");
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy8.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy8);
        validationProxy8.register("", "", "");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = validationProxy7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        java.lang.Class<?> wildcardClass28 = validationProxy22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy3.register("hi!", "hi!", "");
        validationProxy3.register("", "", "");
        validationProxy3.register("hi!", "hi!", "");
        login.ValidationProxy validationProxy16 = new login.ValidationProxy((login.Client) validationProxy3);
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy3);
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
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        java.lang.Class<?> wildcardClass26 = validationProxy15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy21);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy7 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy8 = new login.ValidationProxy((login.Client) validationProxy6);
        validationProxy8.register("", "", "");
        validationProxy8.register("", "hi!", "");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("hi!", "hi!", "hi!");
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy13.register("", "", "");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy9);
        validationProxy9.register("", "", "hi!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        login.ValidationProxy validationProxy22 = new login.ValidationProxy((login.Client) validationProxy17);
        login.ValidationProxy validationProxy23 = new login.ValidationProxy((login.Client) validationProxy17);
        java.lang.Class<?> wildcardClass24 = validationProxy23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy15);
        validationProxy15.register("", "", "");
        validationProxy15.register("hi!", "", "");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
            java.lang.String str36 = validationProxy28.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.realClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        java.lang.Class<?> wildcardClass16 = validationProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy5 = new login.ValidationProxy((login.Client) validationProxy4);
        validationProxy4.register("", "", "hi!");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy11);
        validationProxy12.register("", "", "");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        login.ValidationProxy validationProxy10 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy1.register("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass22 = validationProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        login.ValidationProxy validationProxy6 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy6.register("", "hi!", "");
        login.ValidationProxy validationProxy11 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy12 = new login.ValidationProxy((login.Client) validationProxy6);
        login.ValidationProxy validationProxy13 = new login.ValidationProxy((login.Client) validationProxy12);
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy12);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        validationProxy1.register("hi!", "", "hi!");
        validationProxy1.register("hi!", "", "");
        validationProxy1.register("", "hi!", "");
        login.ValidationProxy validationProxy14 = new login.ValidationProxy((login.Client) validationProxy1);
        validationProxy14.register("", "", "");
        validationProxy14.register("hi!", "", "");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        login.Client client0 = null;
        login.ValidationProxy validationProxy1 = new login.ValidationProxy(client0);
        login.ValidationProxy validationProxy2 = new login.ValidationProxy((login.Client) validationProxy1);
        login.ValidationProxy validationProxy3 = new login.ValidationProxy((login.Client) validationProxy2);
        login.ValidationProxy validationProxy4 = new login.ValidationProxy((login.Client) validationProxy2);
        validationProxy4.register("", "", "");
        validationProxy4.register("", "hi!", "hi!");
        validationProxy4.register("", "", "");
        login.ValidationProxy validationProxy17 = new login.ValidationProxy((login.Client) validationProxy4);
        login.ValidationProxy validationProxy18 = new login.ValidationProxy((login.Client) validationProxy4);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        validationProxy24.register("", "hi!", "");
    }
}

