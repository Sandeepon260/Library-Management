package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class nonfacultytest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        java.lang.String str11 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str13 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str12 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient15.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        java.lang.String str2 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str15 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient16.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        java.lang.Class<?> wildcardClass11 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        java.lang.String str15 = nonFacultyClient11.getType();
        java.lang.String str16 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient15.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str18 = nonFacultyClient17.getType();
        login.nonFacultyClient nonFacultyClient19 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        java.lang.String str20 = nonFacultyClient19.getType();
        login.nonFacultyClient nonFacultyClient21 = new login.nonFacultyClient((login.Client) nonFacultyClient19);
        login.nonFacultyClient nonFacultyClient22 = new login.nonFacultyClient((login.Client) nonFacultyClient21);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient21.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.String str5 = nonFacultyClient3.getType();
        java.lang.String str6 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.Class<?> wildcardClass15 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str16 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str19 = nonFacultyClient18.getType();
        login.nonFacultyClient nonFacultyClient20 = new login.nonFacultyClient((login.Client) nonFacultyClient18);
        login.nonFacultyClient nonFacultyClient21 = new login.nonFacultyClient((login.Client) nonFacultyClient18);
        java.lang.Class<?> wildcardClass22 = nonFacultyClient21.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        java.lang.String str13 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str15 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str16 = nonFacultyClient11.getType();
        java.lang.String str17 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str17 = nonFacultyClient15.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.Class<?> wildcardClass14 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str8 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.Class<?> wildcardClass12 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.Class<?> wildcardClass15 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        java.lang.String str10 = nonFacultyClient6.getType();
        java.lang.String str11 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient7.getType();
        java.lang.String str13 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.String str7 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str13 = nonFacultyClient8.getType();
        java.lang.String str14 = nonFacultyClient8.getType();
        java.lang.String str15 = nonFacultyClient8.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        java.lang.Class<?> wildcardClass15 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str12 = nonFacultyClient4.getType();
        java.lang.String str13 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str8 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str11 = nonFacultyClient10.getType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient4.getType();
        java.lang.String str12 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient15.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str16 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str8 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        java.lang.String str13 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str15 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str16 = nonFacultyClient10.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = nonFacultyClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient16.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient7.getType();
        java.lang.String str12 = nonFacultyClient7.getType();
        java.lang.String str13 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient10.getType();
        java.lang.Class<?> wildcardClass15 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient13.getType();
        java.lang.String str15 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass12 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        java.lang.String str13 = nonFacultyClient10.getType();
        java.lang.String str14 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str8 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str13 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass14 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        java.lang.String str10 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        java.lang.String str10 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient10.getType();
        java.lang.String str14 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient8.getType();
        java.lang.String str13 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass14 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str13 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str15 = nonFacultyClient12.getType();
        java.lang.String str16 = nonFacultyClient12.getType();
        java.lang.Class<?> wildcardClass17 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str18 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient1.getType();
        java.lang.String str5 = nonFacultyClient1.getType();
        java.lang.String str6 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str17 = nonFacultyClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient15.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient11.getType();
        java.lang.String str15 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient6.getType();
        java.lang.String str11 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass11 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient7.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str15 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str16 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient19 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str20 = nonFacultyClient19.getType();
        java.lang.String str21 = nonFacultyClient19.getType();
        java.lang.Class<?> wildcardClass22 = nonFacultyClient19.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient17.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        java.lang.String str9 = nonFacultyClient5.getType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str17 = nonFacultyClient16.getType();
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = nonFacultyClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.Class<?> wildcardClass18 = nonFacultyClient17.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        java.lang.String str10 = nonFacultyClient7.getType();
        java.lang.String str11 = nonFacultyClient7.getType();
        java.lang.String str12 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient1.getType();
        java.lang.String str5 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        java.lang.String str15 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient16.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient14.getType();
        java.lang.String str18 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        java.lang.String str11 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str13 = nonFacultyClient2.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        java.lang.String str10 = nonFacultyClient6.getType();
        java.lang.String str11 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str10 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str15 = nonFacultyClient14.getType();
        java.lang.Class<?> wildcardClass16 = nonFacultyClient14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        java.lang.String str2 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass15 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str12 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient14.getType();
        java.lang.String str17 = nonFacultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str15 = nonFacultyClient12.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str12 = nonFacultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient13.getType();
        java.lang.String str15 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str13 = nonFacultyClient8.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient11.getType();
        java.lang.Class<?> wildcardClass15 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        java.lang.Class<?> wildcardClass15 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.Class<?> wildcardClass18 = nonFacultyClient16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.String str18 = nonFacultyClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient16.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.Class<?> wildcardClass14 = nonFacultyClient13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str15 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.String str5 = nonFacultyClient3.getType();
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.String str7 = nonFacultyClient3.getType();
        java.lang.String str8 = nonFacultyClient3.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str15 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.Class<?> wildcardClass15 = nonFacultyClient14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str13 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient15.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str12 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        java.lang.Class<?> wildcardClass12 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.Class<?> wildcardClass15 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient7.getType();
        java.lang.String str12 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient3.getType();
        java.lang.String str9 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str12 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient4.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        java.lang.String str10 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str17 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.String str7 = nonFacultyClient3.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str14 = nonFacultyClient9.getType();
        java.lang.String str15 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str16 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str19 = nonFacultyClient18.getType();
        login.nonFacultyClient nonFacultyClient20 = new login.nonFacultyClient((login.Client) nonFacultyClient18);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient18.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str9 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        java.lang.String str8 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.Class<?> wildcardClass12 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str13 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient11.getType();
        java.lang.String str15 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        java.lang.String str11 = nonFacultyClient4.getType();
        java.lang.String str12 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str12 = nonFacultyClient5.getType();
        java.lang.String str13 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.String str5 = nonFacultyClient3.getType();
        java.lang.String str6 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        java.lang.String str13 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass11 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        java.lang.String str13 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str17 = nonFacultyClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient15.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        java.lang.String str15 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.Class<?> wildcardClass15 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str12 = nonFacultyClient2.getType();
        java.lang.String str13 = nonFacultyClient2.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        java.lang.String str10 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str15 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str16 = nonFacultyClient15.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = nonFacultyClient17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str11 = nonFacultyClient7.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient6.getType();
        java.lang.String str11 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.String str19 = nonFacultyClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = nonFacultyClient18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient2.getType();
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.String str9 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.String str5 = nonFacultyClient3.getType();
        java.lang.String str6 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str15 = nonFacultyClient11.getType();
        java.lang.String str16 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str18 = nonFacultyClient17.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        login.nonFacultyClient nonFacultyClient19 = new login.nonFacultyClient((login.Client) nonFacultyClient18);
        java.lang.Class<?> wildcardClass20 = nonFacultyClient19.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str14 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.Class<?> wildcardClass18 = nonFacultyClient16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = nonFacultyClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str15 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str9 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass10 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient4.getType();
        java.lang.String str9 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient15.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str18 = nonFacultyClient17.getType();
        login.nonFacultyClient nonFacultyClient19 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        java.lang.String str20 = nonFacultyClient19.getType();
        login.nonFacultyClient nonFacultyClient21 = new login.nonFacultyClient((login.Client) nonFacultyClient19);
        login.nonFacultyClient nonFacultyClient22 = new login.nonFacultyClient((login.Client) nonFacultyClient19);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str13 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str15 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient16.getType();
        login.nonFacultyClient nonFacultyClient18 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient1.getType();
        java.lang.String str5 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient6.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str15 = nonFacultyClient14.getType();
        java.lang.String str16 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        java.lang.String str2 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        java.lang.String str2 = nonFacultyClient1.getType();
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str17 = nonFacultyClient14.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str15 = nonFacultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient12.getType();
        java.lang.String str14 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        java.lang.String str8 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        java.lang.String str11 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str13 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str15 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient12.getType();
        java.lang.String str15 = nonFacultyClient12.getType();
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str13 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient14.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.String str9 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass11 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient14.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        java.lang.Class<?> wildcardClass13 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str13 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient13.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.String str7 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient11.getType();
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.String str18 = nonFacultyClient17.getType();
        java.lang.String str19 = nonFacultyClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient17.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.String str16 = nonFacultyClient15.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str18 = nonFacultyClient17.getType();
        login.nonFacultyClient nonFacultyClient19 = new login.nonFacultyClient((login.Client) nonFacultyClient17);
        login.nonFacultyClient nonFacultyClient20 = new login.nonFacultyClient((login.Client) nonFacultyClient19);
        java.lang.String str21 = nonFacultyClient20.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = nonFacultyClient20.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.Class<?> wildcardClass17 = nonFacultyClient15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        java.lang.String str10 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str16 = nonFacultyClient15.getType();
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str9 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str10 = nonFacultyClient9.getType();
        java.lang.String str11 = nonFacultyClient9.getType();
        java.lang.String str12 = nonFacultyClient9.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass11 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str10 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str13 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str10 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str12 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str15 = nonFacultyClient14.getType();
        java.lang.Class<?> wildcardClass16 = nonFacultyClient14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str10 = nonFacultyClient7.getType();
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient12);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        java.lang.String str17 = nonFacultyClient15.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str12 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.String str15 = nonFacultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient8.getType();
        java.lang.String str12 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str9 = nonFacultyClient4.getType();
        java.lang.String str10 = nonFacultyClient4.getType();
        java.lang.String str11 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = nonFacultyClient17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str12 = nonFacultyClient9.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.String str7 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str9 = nonFacultyClient8.getType();
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient14 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient8);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient9);
        java.lang.String str11 = nonFacultyClient10.getType();
        java.lang.String str12 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient13 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.String str14 = nonFacultyClient13.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient13);
        java.lang.Class<?> wildcardClass16 = nonFacultyClient15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient10 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        java.lang.String str13 = nonFacultyClient11.getType();
        java.lang.String str14 = nonFacultyClient11.getType();
        login.nonFacultyClient nonFacultyClient15 = new login.nonFacultyClient((login.Client) nonFacultyClient11);
        login.nonFacultyClient nonFacultyClient16 = new login.nonFacultyClient((login.Client) nonFacultyClient15);
        login.nonFacultyClient nonFacultyClient17 = new login.nonFacultyClient((login.Client) nonFacultyClient16);
        java.lang.String str18 = nonFacultyClient17.getType();
        java.lang.String str19 = nonFacultyClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient17.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.String str8 = nonFacultyClient5.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }
}

