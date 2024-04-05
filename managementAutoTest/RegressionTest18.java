package managementAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str12 = managementClient7.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        java.lang.String str11 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = managementClient1.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass10 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient16.getType();
        java.lang.String str18 = managementClient16.getType();
        java.lang.Class<?> wildcardClass19 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass13 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str15 = managementClient11.getType();
        java.lang.Class<?> wildcardClass16 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        java.lang.Class<?> wildcardClass13 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.Class<?> wildcardClass10 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient5.getType();
        java.lang.Class<?> wildcardClass13 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        java.lang.String str13 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str17 = managementClient11.getType();
        java.lang.Class<?> wildcardClass18 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        java.lang.String str13 = managementClient10.getType();
        java.lang.String str14 = managementClient10.getType();
        java.lang.String str15 = managementClient10.getType();
        java.lang.Class<?> wildcardClass16 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass11 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = managementClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.Class<?> wildcardClass7 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient2.getType();
        java.lang.Class<?> wildcardClass8 = managementClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient16.getType();
        java.lang.String str18 = managementClient16.getType();
        java.lang.Class<?> wildcardClass19 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass11 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient13.getType();
        java.lang.Class<?> wildcardClass15 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str17 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        java.lang.String str17 = managementClient15.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient3.getType();
        java.lang.Class<?> wildcardClass13 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass13 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str18 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.Class<?> wildcardClass17 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        java.lang.Class<?> wildcardClass8 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        java.lang.Class<?> wildcardClass19 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.String str7 = managementClient2.getType();
        java.lang.String str8 = managementClient2.getType();
        java.lang.String str9 = managementClient2.getType();
        java.lang.Class<?> wildcardClass10 = managementClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str15 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient15.getType();
        java.lang.String str17 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        java.lang.String str3 = managementClient1.getType();
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        java.lang.String str8 = managementClient1.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        java.lang.Class<?> wildcardClass14 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient19.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient3.getType();
        java.lang.String str13 = managementClient3.getType();
        java.lang.Class<?> wildcardClass14 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str15 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass15 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        java.lang.Class<?> wildcardClass12 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient14.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient9.getType();
        java.lang.String str14 = managementClient9.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str15 = managementClient9.getType();
        java.lang.String str16 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient13.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient3.getType();
        java.lang.String str13 = managementClient3.getType();
        java.lang.String str14 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str11 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient14.getType();
        java.lang.String str17 = managementClient14.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        java.lang.String str14 = managementClient9.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str17 = managementClient14.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass17 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient15.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient18);
        java.lang.String str20 = managementClient19.getType();
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient19);
        java.lang.Class<?> wildcardClass22 = managementClient21.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        java.lang.Class<?> wildcardClass13 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        java.lang.Class<?> wildcardClass16 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        java.lang.String str18 = managementClient16.getType();
        java.lang.String str19 = managementClient16.getType();
        java.lang.String str20 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        java.lang.String str12 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str14 = managementClient3.getType();
        java.lang.String str15 = managementClient3.getType();
        java.lang.String str16 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient15.getType();
        java.lang.String str17 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient4.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass14 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient12.getType();
        java.lang.Class<?> wildcardClass18 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        java.lang.String str10 = managementClient5.getType();
        java.lang.Class<?> wildcardClass11 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        java.lang.String str12 = managementClient6.getType();
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient12.getType();
        java.lang.String str17 = managementClient12.getType();
        java.lang.String str18 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient14.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient17.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient3.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient6.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str8 = managementClient2.getType();
        java.lang.String str9 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient5.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass14 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = managementClient1.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str12 = managementClient6.getType();
        java.lang.String str13 = managementClient6.getType();
        java.lang.String str14 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient12.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.Class<?> wildcardClass15 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass15 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.String str7 = managementClient2.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.Class<?> wildcardClass10 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        java.lang.String str10 = managementClient6.getType();
        java.lang.String str11 = managementClient6.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        java.lang.String str15 = managementClient11.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient15.getType();
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient15);
        java.lang.Class<?> wildcardClass20 = managementClient19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str18 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str13 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        java.lang.String str19 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass16 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient7.getType();
        java.lang.String str14 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        java.lang.String str9 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        java.lang.String str19 = managementClient18.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }
}

